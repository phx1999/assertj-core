/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2020 the original author or authors.
 */
package org.assertj.core.api.classes;

import org.assertj.core.api.ClassAssert;
import org.assertj.core.api.ClassAssertBaseTest;
import org.assertj.core.api.WritableAssertionInfo;

import static org.mockito.Mockito.verify;

/**
 * Tests for <code>{@link org.assertj.core.api.ClassAssert#hasProtectedConstructor(Class[])}</code>.
 *
 * @author phx
 */
public class ClassAssert_hasProtectedConstructor_Test extends ClassAssertBaseTest {
  @Override
  protected ClassAssert invoke_api_method() {
    return assertions.hasProtectedConstructor(String.class,char.class);
  }

  @Override
  protected void verify_internal_effects() {
    verify(classes).assertHasProtectedConstuctors((WritableAssertionInfo) getInfo(assertions),
      getActual(assertions), String.class,char.class);
  }
}
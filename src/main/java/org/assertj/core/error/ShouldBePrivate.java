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
package org.assertj.core.error;


import java.lang.reflect.Constructor;

/**
 * Creates an error message indicating that an assertion that verifies that a constructor is
 * private
 *
 * @author phx
 */
public class ShouldBePrivate extends BasicErrorMessageFactory {

  private ShouldBePrivate(Constructor actual, String modifier) {
    super("%nExpecting <%s> to be a Private%nbut the modifier is <%s>", actual, modifier);
  }

  /**
   * Creates a new <code>{@link ShouldBePrivate}</code>.
   *
   * @param actual the actual Constructor.
   * @param modifier the actual modifier of Constructor.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static ErrorMessageFactory shouldBePrivate(Constructor actual, String modifier) {
    return new ShouldBePrivate(actual, modifier);
  }
}

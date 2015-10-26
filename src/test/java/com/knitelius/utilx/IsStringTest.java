/*
 * Copyright 2015 Stephan Knitelius <stephan@knitelius.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.knitelius.utilx;

import org.junit.Assert;
import org.junit.Test;

public class IsStringTest {

  @Test
  public void test_string_empty() {
    Assert.assertTrue(Is.string("").empty());
    Assert.assertTrue(Is.string(null).empty());
  }

  @Test
  public void test_string_not_empty() {
    Assert.assertTrue(Is.string("asdf").notEmpty());
    Assert.assertFalse(Is.string(null).notEmpty());
  }

  @Test
  public void test_string_equal_to() {
    Assert.assertTrue(Is.string("asdf").equalTo("asdf"));
    Assert.assertFalse(Is.string(null).equalTo("asdf"));
    Assert.assertFalse(Is.string("asdf").equalTo(null));
  }

}

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

/**
 *
 * @author u110252
 */
public class DoesStringTest {

  @Test
  public void test_string_start_with() {
    Assert.assertTrue(Does.string("foo").startWith("f"));
    Assert.assertFalse(Does.string("Foo").startWith("Ba"));
  }

  @Test
  public void test_string_end_with() {
    Assert.assertTrue(Does.string("foo").endWith("o"));
    Assert.assertFalse(Does.string("Foo").endWith("ar"));
  }

  @Test
  public void test_string_contain() {
    Assert.assertTrue(Does.string("foo").contain("o"));
    Assert.assertFalse(Does.string("Foo").contain("bar"));
  }

}

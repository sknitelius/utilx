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
 * @author Stephan Knitelius <stephan@knitelius.com>
 */
public class IsNumberTest {

  @Test
  public void test_number_in_range() {
    Assert.assertTrue(Is.number(4).between(2).and(5));
    Assert.assertFalse(Is.number(1).between(200).and(500));
  }
}

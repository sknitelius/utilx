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
package com.knitelius.utilx.string;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Stephan Knitelius <stephan@knitelius.com>
 */
public class DoesString {

  private final String str;

  public DoesString(String str) {
    this.str = str;
  }

  public boolean contain(String contain) {
    return StringUtils.contains(str, contain);
  }

  public boolean startWith(String startWith) {
    return StringUtils.startsWith(str, startWith);
  }

  public boolean endWith(String endWith) {
    return StringUtils.endsWith(str, endWith);
  }

}

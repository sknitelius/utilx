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
public class IsString {

  private final String str;

  public IsString(String str) {
    this.str = str;
  }

  public boolean empty() {
    return StringUtils.isEmpty(str);
  }

  public boolean notEmpty() {
    return StringUtils.isNotEmpty(str);
  }

  public boolean blank() {
    return StringUtils.isBlank(str);
  }

  public boolean noneBlank() {
    return StringUtils.isNoneBlank(str);
  }

  public boolean allUpper() {
    return StringUtils.isAllUpperCase(str);
  }

  public boolean allLower() {
    return StringUtils.isAllLowerCase(str);
  }

  public boolean nummeric() {
    return StringUtils.isNumeric(str);
  }

  public boolean equalTo(String compare) {
    return StringUtils.equals(str, compare);
  }

}

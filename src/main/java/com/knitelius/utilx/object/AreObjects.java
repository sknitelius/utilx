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
package com.knitelius.utilx.object;

/**
 *
 * @author Stephan Knitelius <stephan@knitelius.com>
 */
public class AreObjects {

  private final Object[] objs;

  public AreObjects(Object[] objs) {
    this.objs = objs;
  }

  public boolean allNull() {
    for (Object obj : objs) {
      if (obj != null) {
        return false;
      }
    }
    return true;
  }

  public boolean noneNull() {
    for (Object obj : objs) {
      if (obj == null) {
        return false;
      }
    }
    return true;
  }

}

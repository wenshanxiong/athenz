/*
 * Copyright 2016 Yahoo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yahoo.athenz.zpe.match.impl;

import java.util.regex.Pattern;

import com.yahoo.athenz.auth.util.StringUtils;
import com.yahoo.athenz.zpe.match.ZpeMatch;

public class ZpeMatchRegex implements ZpeMatch {

    private Pattern pattern;
    public ZpeMatchRegex(String value) {
        pattern = Pattern.compile(StringUtils.patternFromGlob(value));
    }

    public boolean matches(String value) {
        return pattern.matcher(value).matches();
    }
}

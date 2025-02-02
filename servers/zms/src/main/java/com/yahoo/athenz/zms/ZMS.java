/*
 * Copyright 2017 Yahoo Inc.
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
package com.yahoo.athenz.zms;

import org.glassfish.jersey.server.ResourceConfig;

class ZMS extends ResourceConfig {
    public ZMS() {
        register(JsonGeneralExceptionMapper.class, 1);
        register(JsonMappingExceptionMapper.class, 1);
        register(JsonParseExceptionMapper.class, 1);
        register(JsonProcessingExceptionMapper.class, 1);
        register(ZMSResources.class);
        register(ZMSBinder.getInstance());
    }
}

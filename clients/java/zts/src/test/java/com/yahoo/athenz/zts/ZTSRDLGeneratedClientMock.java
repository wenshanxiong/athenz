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
package com.yahoo.athenz.zts;

import javax.net.ssl.HostnameVerifier;

public class ZTSRDLGeneratedClientMock extends ZTSRDLGeneratedClient {

    private HostnameVerifier hostnameVerifier;

    public ZTSRDLGeneratedClientMock(String url, HostnameVerifier hostnameVerifier) {
        super(url, hostnameVerifier);
        this.hostnameVerifier = hostnameVerifier;
    }

    public HostnameVerifier getHostnameVerifier() {
        return hostnameVerifier;
    }
}

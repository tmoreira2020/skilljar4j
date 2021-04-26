/**
 * Copyright © 2021 Thiago Moreira (tmoreira2020@gmail.com)
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
package br.com.thiagomoreira.skilljar;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import feign.mock.MockTarget;

public class SkilljarTest {

    protected Skilljar skilljar;
    protected MockClient mockClient;

    @Before
    public void setup() throws IOException {
        mockClient = new MockClient();
        skilljar = Feign.builder().decoder(new GsonDecoder()).client(mockClient.ok(HttpMethod.GET, "/v1/ping"))
                .target(new MockTarget<>(Skilljar.class));
    }

    @Test
    public void hitPing() {
        skilljar.ping();
        mockClient.verifyStatus();
    }

}
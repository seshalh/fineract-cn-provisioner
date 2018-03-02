/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.mifos.provisioner.client;

import io.mifos.provisioner.api.v1.domain.Client;

class Fixture {

  private static Client compTestClient = new Client();

  static {
    compTestClient.setName("comp-test");
    compTestClient.setDescription("Component Test Client");
    compTestClient.setHomepage("http://www.example.org");
    compTestClient.setVendor("Component Test");
    compTestClient.setRedirectUri("http://redirect.me");
  }

  private Fixture() {
    super();
  }

  static Client getCompTestClient() {
    return compTestClient;
  }
}

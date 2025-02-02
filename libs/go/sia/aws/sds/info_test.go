//
// Copyright Athenz Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package sds

import "testing"

func TestAuthType(test *testing.T) {
	info := ClientInfo{
		UserID: 101,
		PID:    102,
	}

	if info.AuthType() != "athenz-uds" {
		test.Errorf("Unexpected auth-type: '%s', expected 'athenz-uds'", info.AuthType())
	}
}

func TestClientAuthType(test *testing.T) {
	if ClientAuthType() != "athenz-uds" {
		test.Errorf("Unexpected client-auth-type: '%s', expected 'athenz-uds'", ClientAuthType())
	}
}

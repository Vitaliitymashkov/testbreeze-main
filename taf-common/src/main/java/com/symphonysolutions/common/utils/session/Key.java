/*
 * Copyright of the Symphony Solutions B.V.
 *
 * Licensed under the TestBreeze Test Automation Framework License Agreement (the "License");
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.symphonysolutions.common.utils.session;

import lombok.Getter;

@Getter
public class Key {

    private final String text;

    private Key(final String text) {
        this.text = text;
    }

    public static String getCanonicalName(Object object) {
        return object.getClass().getCanonicalName();
    }

    @Override
    public String toString() {
        return text;
    }

    public enum Keys {
        COUNT("count"),
        PASSED_TESTS("passed_tests"),
        FAILED_TESTS("failed_tests"),

        ACTIVE_BROWSER("browser");

        Keys(final String text) {
        }
    }

}

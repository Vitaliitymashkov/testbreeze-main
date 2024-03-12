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

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings({"NullableProblems", "rawtypes", "unchecked"})
public class TestSessionVariables<K, V> extends ConcurrentHashMap implements Map {
    private final ConcurrentHashMap metadata = new ConcurrentHashMap();

    public TestSessionVariables() {
    }

    public void shouldContainKey(Object key) {
        Object result = super.get(key);
        if (result == null) {
            throw new AssertionError("Session variable " + key + " expected but not found.");
        }
    }

    @SuppressWarnings("Convert2Diamond")
    public Object put(Object key, Object value) {
        return value == null ? this.remove(key) : new HashMap<Object,Object>().put(key, value);
    }

    public Map<String, String> getMetaData() {
        return ImmutableMap.copyOf(this.metadata);
    }

    public void addMetaData(String key, String value) {
        this.metadata.put(key, value);
    }

    public void clearMetaData() {
        this.metadata.clear();
    }

    public void clear() {
        this.clearMetaData();
        super.clear();
    }
}
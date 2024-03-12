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
package com.symphonysolutions.common.utils.helpers;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static String getRandomString()
    {
        return  Long.toHexString(Double.doubleToLongBits(Math.random()));
    }

    public static String getRandomNumber()
    {
        return  Long.toHexString(ThreadLocalRandom.current().nextLong(0, 32767));
    }
}

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
package com.symphonysolutions.common.services.ui.drivers;

import com.codeborne.selenide.Configuration;

@SuppressWarnings("SpellCheckingInspection")
public class DriverManager {

    public static void initBrowser(String browser){
        switch (browser){
            case "Chrome":
                initChrome();
                break;
            case "Selenoid":
                initSelenoid();
                break;
            default: initHeadlessChrome();
        }
        Configuration.timeout = 20000;
    }

    private static void initHeadlessChrome(){
        Configuration.browser = "com.symphonysolutions.common.services.ui.drivers.HeadlessChromeDriver";
    }

    private static void initChrome(){
        Configuration.browser = "com.symphonysolutions.common.services.ui.drivers.ChromeDriver";
    }

    private static void initSelenoid(){
        Configuration.browser = "com.symphonysolutions.common.services.ui.drivers.SelenoidDriver";
    }
}

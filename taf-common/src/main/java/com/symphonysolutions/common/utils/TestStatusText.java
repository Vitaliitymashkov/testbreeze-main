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
package com.symphonysolutions.common.utils;

import lombok.Getter;

@Getter
public class TestStatusText {

    private final String TEXT_FOR_START = "  \n _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____  \n" +
            "|_   _| ____/ ___|_   _| / ___|_   _|/ \\  |  _ \\_   _| ____|  _ \\ \n" +
            "  | | |  _| \\___ \\ | |   \\___ \\ | | / _ \\ | |_) || | |  _| | | | |\n" +
            "  | | | |___ ___) || |    ___) || |/ ___ \\|  _ < | | | |___| |_| |\n" +
            "  |_| |_____|____/ |_|   |____/ |_/_/   \\_\\_| \\_\\|_| |_____|____/\n" +
            "                                                                               \n";
    private final String TEXT_FOR_FAILED_TEST = "\n           __  _____ _____ ____ _____   _____ _    ___ _     _____ ____  \n" +
            "  _       / / |_   _| ____/ ___|_   _| |  ___/ \\  |_ _| |   | ____|  _ \\ \n" +
            " (_)_____| |    | | |  _| \\___ \\ | |   | |_ / _ \\  | || |   |  _| | | | |\n" +
            "  _|_____| |    | | | |___ ___) || |   |  _/ ___ \\ | || |___| |___| |_| |\n" +
            " (_)     | |    |_| |_____|____/ |_|   |_|/_/   \\_\\___|_____|_____|____/ \n" +
            "          \\_\\  ";
    private final String TEXT_FOR_PASSED_TEST = "\n        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____  \n" +
            "  _     \\ \\  |_   _| ____/ ___|_   _| |  _ \\ / \\  / ___|/ ___|| ____|  _ \\ \n" +
            " (_)_____| |   | | |  _| \\___ \\ | |   | |_) / _ \\ \\___ \\\\___ \\|  _| | | | |\n" +
            "  _|_____| |   | | | |___ ___) || |   |  __/ ___ \\ ___) |___) | |___| |_| |\n" +
            " (_)     | |   |_| |_____|____/ |_|   |_| /_/   \\_\\____/|____/|_____|____/ \n" +
            "        /_/ ";

}

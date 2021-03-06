/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class Blort
{
    public static Object zorch1(String s) {
        return null;
    }

    public static void test1() {
        try {
            zorch1("x");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void zorch2(String s) {
        // This space intentionally left blank.
    }

    public static void test2() {
        try {
            zorch2("x");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static int zorch3(String s) {
        return 0;
    }

    public static void test3() {
        try {
            zorch3("x");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Object zorch4(int x) {
        return null;
    }

    public static void test4() {
        try {
            zorch4(1);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Object zorch5(int x) {
        return null;
    }

    public static Object test5() {
        try {
            return zorch5(1);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

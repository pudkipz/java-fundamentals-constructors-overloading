package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*
        Implement the following methods:

        1. add, which accepts two floats and returns a float (both floats added together) */
        public float add(float a, float b) {
            return a + b;
        }
    /*

        2. add, which accepts two doubles and returns a double (both doubles added together) */
        public double add(double a, double b) {
            return a + b;
        }
    /*

        3. subtract, which accepts two floats and returns a float (first float minus second float) */
        public float subtract(float a, float b) {
            return a - b;
        }
    /*

        4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed */
        public String subtract(String s, char removeChar) {
            return s.replaceAll(Character.toString(removeChar), "");
        }
    /*

        5. multiply, which accepts two ints and returns an int (first int multiplied by second int) */
        public int multiply(int a, int b) {
            return a * b;
        }

    /*

        6. multiply, which accepts a string and an int, and returns a string containing the provided string
        as many times as the provided int separated by a comma. E.g.
        multiply("Hello", 3) -> "Hello,Hello,Hello" */
        public String multiply(String s, int n) {
            return s + ("," + s).repeat(Math.max(0, n - 1));
        }

    /*

        7. multiply, which accepts an array of Strings that each contain a number, and an int
        The method should return an array of ints that contain the value of multiplying each String number by the provided int
        E.g.
        multiply(["2", "7", "3"], 3) -> [6, 21, 9]
     */
    public int[] multiply(String[] sArr, int n) {
        int[] resultArr = new int[sArr.length];
        for (int i=0; i<sArr.length; i++) {
            int m = Integer.parseInt(sArr[i]);
            resultArr[i] = m * n;
        }
        return resultArr;
    }


}

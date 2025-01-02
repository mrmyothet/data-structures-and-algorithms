package com.myothet.dsa.recursion;

public class Factorial {

    int factorial(int n) {
        if (n == 0) {
            return 1; //base case
        } else {
            return n * factorial(n - 1);
        }
    }

}

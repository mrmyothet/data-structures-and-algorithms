package com.myothet.dsa.datastructure;

import java.util.Stack;

public class Reverser {

    public String reverse(String str) {

        String result = "";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

//        for (int i = 0; i < str.length(); i++) {
//            result += stack.pop();
//        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}

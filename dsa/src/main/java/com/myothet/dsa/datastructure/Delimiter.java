package com.myothet.dsa.datastructure;

import java.util.Stack;

public class Delimiter {

    public boolean isValid(String input) {
        
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<input.length(); i++)
        {
            char ch = input.charAt(i);
            
            if(ch=='[')
            {
                stack.push(ch);
            }
            
            else if(ch == ']')
            {
                stack.pop();
            }
        }
        
        
        return stack.isEmpty();
    }

}

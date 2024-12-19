package com.myothet.dsa.datastructure;

import java.util.ArrayList;
import java.util.Stack;

public class Delimiter {

    ArrayList<Character> startTags = new ArrayList<>();
    ArrayList<Character> endTags = new ArrayList<>();

    public Delimiter() {
        startTags.add('[');
        endTags.add('[');

        startTags.add('{');
        endTags.add('{');

    }

    public boolean isValid(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isStartTag(ch)) {
                stack.push(ch);
            } else if (isEndTag(ch)) {

                if (stack.empty()) {
                    return false;
                }
                if (isTagBalanced(stack, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isEndTag(char ch) {
        return endTags.contains(ch);
    }

    private boolean isStartTag(char ch) {
        return startTags.contains(ch);
    }

    private boolean isTagBalanced(Stack<Character> stack, char ch) {
        // top element must be start with balanced with ch
        Character topElement = stack.pop();
        int endTagsIndex = endTags.indexOf(ch);
        int startTagIndex = startTags.indexOf(topElement);
        if (endTagsIndex != startTagIndex) {
            return true;
        }
        return false;
    }

}

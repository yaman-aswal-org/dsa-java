package dsa_patterns;

import java.util.Stack;

public class StackEasyQuestions {

    public static void main(String[] args) {
        String s = "[]";
        boolean value = validParentheses(s);

        if (value) {
            System.out.println("Valid..");
        } else {
            System.out.println("In - Valid..");
        }
    }

    /* You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'
    * The input string s is valid if and only if:
        Every open bracket is closed by the same type of close bracket.
        Open brackets are closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
        Return true if s is a valid string, and false otherwise.*/
    private static boolean validParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    st.push(ch);
                    break;

                case ')':
                    if (st.isEmpty() || st.peek() != '(') return false;
                    st.pop();
                    break;

                case '}':
                    if (st.isEmpty() || st.peek() != '{') return false;
                    st.pop();
                    break;

                case ']':
                    if (st.isEmpty() || st.peek() != '[') return false;
                    st.pop();
                    break;

                default:
                    // If there are only valid chars, you can ignore or return false
                    return false;
            }
        }

        return st.isEmpty();
    }


    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                st1.pop();
            } else {
                st1.push(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                st2.pop();
            } else {
                st2.push(ch);
            }
        }

        return st1.size() == st2.size();

    }
}

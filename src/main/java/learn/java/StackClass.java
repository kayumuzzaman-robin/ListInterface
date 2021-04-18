package learn.java;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        System.out.println("is stringStack empty? Ans: " + stringStack.empty());

        stringStack.push("Geeks");
        stringStack.push("is");
        stringStack.push("fun");
        System.out.println("stringStack: " + stringStack);

        System.out.println("using pop() " + stringStack.pop() + " & after pop() stringStack: " + stringStack);

        System.out.println("using peek() " + stringStack.peek() + " & after pop() stringStack: " + stringStack);

        System.out.println("using search(is), found at index: " + stringStack.search("is"));


    }
}

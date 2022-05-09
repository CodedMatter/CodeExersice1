/*Coding exercise: You are tasked to write a checker that validates
the parentheses of a LISP code. Write a program (in Java or JavaScript)
which takes in a string as an input and returns true if all the
parentheses in the string are properly closed and nested.*/

public class Main {
    public static void main(String[] args) {
        Checker checker = new Checker();
        System.out.println(checker.areParenThesisCloseAndNested("((()())"));
    }
}
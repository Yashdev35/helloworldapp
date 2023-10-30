package com.example.javapractice;

public class CodeRunner {
    public static String codeRunner(int command){
        String instruction;
        if (command == 0) {
           instruction = "CodeRunner running North";
        } else if (command == 1) {
            instruction = "CodeRunner running South";
        } else if (command == 2) {
            instruction = "CodeRunner running West";
        } else if (command == 3) {
            instruction = "CodeRunner running West";
        } else {
            instruction = "CodeRunner is confused - doesn't know where to go!";
        }
        return instruction;
    }

    public static void main(String[] args) {
        System.out.println(  codeRunner(1));
    }

}

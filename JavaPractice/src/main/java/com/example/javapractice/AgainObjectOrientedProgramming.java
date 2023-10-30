package com.example.javapractice;
class pans{
    int weight ;
    int price ;
    String name;
}
public class AgainObjectOrientedProgramming {
    public static void main(String[] args) {
        pans prestige = new pans();
        prestige.name = "prestige pan";
        prestige.price = 345;
        prestige.weight = 3;
        System.out.println(prestige);
    }
}

package com.company;
class A{
    public void print(){
        System.out.println("I am A");
    }
}
class B extends A{
    public void print(){
        super.print();
        System.out.println("I am B");
    }
}
public class Main {
    public static void main(String[] args) {
	B rando = new B();
    rando.print();
    }
}

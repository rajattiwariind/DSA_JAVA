package com.masai;
public class Main{
int x=10;
public static void main(String[] args){
Main obj1=new Main();
obj1.x=50;
System.out.println(obj1.x); //50
Main obj2=new Main();
System.out.println(obj2.x); //10
}
}

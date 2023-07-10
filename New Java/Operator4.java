package com.masai;
public class Main{
public static void main(String[] args{
boolean b1=true;
boolean b2=false;
System.out.println(b1&b1);//true
System.out.println(b1&b2);//false
System.out.println(b2&b1);//false
System.out.println(b2&b2);//false
System.out.println(b1|b1);//true
System.out.println(b1|b2);//true
System.out.println(b2|b1);//true
System.out.println(b2|b2);//false
System.out.println(b1^b1);//false
System.out.println(b1^b2);//true
System.out.println(b2^b1);//true
System.out.println(b2^b2);//false
}
}

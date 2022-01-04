package com.company;
import java.util.Scanner;
//import lop Scanner tu goi java.util
public class Main {
    public static void main(String[] args) {
	float width;
    float height;
    Scanner sc = new Scanner(System.in);//khai bao doi tuong Scanner
    System.out.println("Input width: ");
    width = sc.nextFloat();
    System.out.println("Input height");
    height = sc.nextFloat();
    float area = width * height;
    System.out.println("Area is " + area);
    }
}

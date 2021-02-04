package com.company;

import java.util.Scanner;

public class chuyendoitiente {

    public static void main(String[] args) {
	double usd =23000;
	double vnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien Usd quy doi");
        vnd = scanner.nextDouble();
        double quydoi = vnd * 23000;
        System.out.println("So tien vnd la : " + quydoi);
    }
}

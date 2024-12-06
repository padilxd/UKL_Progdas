package com.mycompany.i2;

import java.util.Scanner;

public class I2 {

    public static double hitungLuasPermukaanBola(double radius) {

        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola (cm): ");
        double radius = scanner.nextDouble();

        double luasPermukaan = hitungLuasPermukaanBola(radius);

        System.out.println("Luas permukaan bola adalah: " + luasPermukaan + " cm²");

        scanner.close();
    }
}

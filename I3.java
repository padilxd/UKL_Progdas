/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.i3;

/**
 *
 * @author FADHIL HILMI
 */
public class I3 {

    public static void main(String[] args) {

        int[] array = {5, -3, 7, 9, -1};

        StringBuilder negatifElemen = new StringBuilder();

        boolean adaNegatif = false;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {

                if (adaNegatif) {
                    negatifElemen.append(", ");
                }

                negatifElemen.append(array[i]);

                adaNegatif = true;
            }
        }

        if (adaNegatif) {
            System.out.println("Array mengandung elemen negatif: " + negatifElemen);
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }
    }
}


package com.mycompany.i1;


public class I1 {

    public static void main(String[] args) {

        

        for (int rpl = 50; rpl > 0; rpl--) {
            if (rpl % 2 == 0) {
                if (rpl == 1) {
                    System.out.println(rpl + ". saya senang");
                } else if (rpl % 3 == 0) {
                    System.out.println(rpl + ". saya angkatan 33");
                } else {
                    System.out.println(rpl + ". saya anak moklet");
                }
            } else if (rpl % 2 == 1) {
                if (rpl % 3 == 0) {
                    System.out.println(rpl + ". saya angkatan 33");
                } else if (rpl == 1) {
                    System.out.println(rpl + ". saya senang");
                } else {
                    System.out.println(rpl + ". saya anak wikusama");
                }
            }
        }
    }
}

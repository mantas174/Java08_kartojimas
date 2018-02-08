package uzduotis_03;

import java.util.Scanner;

public class PrekiuKiekis {

    public PrekiuKiekis(){
        System.out.println("TRECIA UZDUOTIS!! KIEK KOKIU PREKIU YRA ISVISO");

        //skirtingu prekiu masyvas A(n)
        int n = 8;// prekiu rusys
        int a, b;

        //A[prekes indentifikatorius][prekes kiekis]
        String [][] A = {
                {"rusis1", "100"},
                {"rusis2", "100"},
                {"rusis3", "100"},
                {"rusis4", "100"},
                {"rusis5", "100"},
                {"rusis6", "100"},
                {"rusis7", "100"},
                {"rusis8", "100"}
        };
        //B(n) atveza prekiu
        String [][] B = {
                {"rusis1", "10"},
                {"rusis2", "20"},
                {"rusis3", "30"},
                {"rusis4", "40"},
                {"rusis5", "50"},
                {"rusis6", "60"},
                {"rusis7", "70"},
                {"rusis8", "80"}
        };
        //kiek kokiu prekiu yra
        System.out.println("Prekiu kiekis: ");
        for(int i = 0; i < n; i++){
            if (A[i][0].equals(B[i][0])){
               // a = Integer.parseInt(A[i][1]);
              //  b = Integer.parseInt(B[i][1]);
              //  A[i][1] = (a + b) + "";
                A[i][1] = (Integer.parseInt(A[i][1]) + Integer.parseInt(B[i][1])) + "";
            }

            System.out.println(A[i][0]+ " " +A[i][1]);
        }




    }
}

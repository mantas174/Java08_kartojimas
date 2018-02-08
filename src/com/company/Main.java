package com.company;

import uzduotis_01.DidziausiApskritimai;
import uzduotis_02.TaskaiKoordinaciuPlokstumoje;
import uzduotis_03.PrekiuKiekis;
import uzduotis_04.DidziausiasTarpMasyvu;
//penkta praleidau
import uzduotis_06.MokinioVidurkis;
import uzduotis_07.GeriausiaiBlogiausiaiBesimokantis;
import uzduotis_08.KiekStudentuAukstesniuUzVidurki;
import uzduotis_09.KiekZmoniuKuriuIndelisDaugiau;
import uzduotis_10.StudentaiKurieGeraiMokosi;



import java.util.Scanner;

public class Main {
    private static final int EXIT_CODE = 0;
    private static final int UZDUOTIS_01 = 1;
    private static final int UZDUOTIS_02 = 2;
    private static final int UZDUOTIS_03 = 3;
    private static final int UZDUOTIS_04 = 4;
    private static final int UZDUOTIS_05 = 5;
    private static final int UZDUOTIS_06 = 6;
    private static final int UZDUOTIS_07 = 7;
    private static final int UZDUOTIS_08 = 8;
    private static final int UZDUOTIS_09 = 9;
    private static final int UZDUOTIS_10 = 10;

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        obj.run();


    }
    private void rodykMeniu(){
        System.out.println("-----------------");
        System.out.println(UZDUOTIS_01+" - uzduotis");
        System.out.println(UZDUOTIS_02+" - uzduotis, neveikia");
        System.out.println(UZDUOTIS_03+" - uzduotis");
        System.out.println(UZDUOTIS_04+" - uzduotis, neveikia");
        System.out.println(UZDUOTIS_05+" - uzduotis, Praleidau");
        System.out.println(UZDUOTIS_06+" - uzduotis");
        System.out.println(UZDUOTIS_07+" - uzduotis");
        System.out.println(UZDUOTIS_08+" - uzduotis");
        System.out.println(UZDUOTIS_09+" - uzduotis");
        System.out.println(UZDUOTIS_10+" - uzduotis");


        System.out.println(EXIT_CODE+" - Baigti");

        System.out.println("-----------------");
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        int pasirinkimas;
        boolean arTesti = true;

        while(arTesti){
            rodykMeniu();
            System.out.println("kuri uzduotis");
            pasirinkimas = in.nextInt();
            switch (pasirinkimas){
                case EXIT_CODE:
                    arTesti = false;
                    System.out.println("Darbas baigtas");
                    break;
                case UZDUOTIS_01:
                    new DidziausiApskritimai();
                    break;
                case UZDUOTIS_02:
                    new TaskaiKoordinaciuPlokstumoje();
                    break;
                case UZDUOTIS_03:
                    new PrekiuKiekis();
                    break;
                case UZDUOTIS_04:
                    new DidziausiasTarpMasyvu();
                    break;
                case UZDUOTIS_05:
                    System.out.println("Praleidau penkta uzduoti");
                    break;
                case UZDUOTIS_06:
                    new MokinioVidurkis();
                    break;
                case UZDUOTIS_07:
                    new GeriausiaiBlogiausiaiBesimokantis();
                    break;
                case UZDUOTIS_08:
                    new KiekStudentuAukstesniuUzVidurki();
                    break;
                case UZDUOTIS_09:
                    new KiekZmoniuKuriuIndelisDaugiau();
                    break;
                case UZDUOTIS_10:
                    new StudentaiKurieGeraiMokosi();
                    break;




                default:
                    System.out.println("kartok pasirinkima");
            }
        }

    }





}

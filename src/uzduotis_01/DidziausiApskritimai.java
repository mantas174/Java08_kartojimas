package uzduotis_01;

import java.util.Scanner;

public class DidziausiApskritimai {

    private int [] _apskritimai;
    public DidziausiApskritimai(){
        System.out.println("PRIMA UZDUOTIS!! DIDZIAUSIO APSKRITIMO RADIMAS");

        duomenuIvedimas();
        didziausiasApskritimasIrKiekis();



    }
    public void duomenuIvedimas(){
        //apskritimu skaicius ivedamas klaviatura
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Iveskite kiek bus apskritimu");
        n = in.nextInt();
        _apskritimai = new int[n];
        for(int i = 0; i < n; i++){
            //ju spinduliai ivedami klaviatura
            System.out.print("Iveskite " +(i+1)+ " apskritimo spinduli ");
            _apskritimai[i] = in.nextInt();
        }
    }
    public void didziausiasApskritimasIrKiekis(){
        double did = Math.PI * Math.pow(_apskritimai[0], 2);
        int kiekis = 0;
        double plotas = 0;

        //surasti didziausia apskritima
        //nustatyti kiek tokiu didziausiu apskritimu yra
        for(int i = 0; i < _apskritimai.length; i++){
            //plotas = pi*r^2
            plotas = Math.PI * (Math.pow(_apskritimai[i], 2));
            if(did < plotas){
                did = plotas;
                kiekis = 1;
            }else if(did == plotas) {
                kiekis++;
            }
        }
        System.out.println("Didziausias apskritimas: " +did+ " tokiu apskritimu buvo: " +kiekis);
    }
}

package uzduotis_06;

public class MokinioVidurkis {

    public MokinioVidurkis(){
        System.out.println("SESTA UZDUOTIS!! MOKINIO TRIMESTRO VIDURKIS");


        float [] pazymiai = {1,2,3,4,5,6,7,8,9};
        int suma = 0;

        for (int i = 0; i < pazymiai.length; i++){
            suma += pazymiai[i];
        }
        System.out.println(suma);
        System.out.println("Mokinio vidurkis: " +(suma/pazymiai.length));
    }
}

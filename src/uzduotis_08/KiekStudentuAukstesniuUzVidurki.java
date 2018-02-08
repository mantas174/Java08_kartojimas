package uzduotis_08;

public class KiekStudentuAukstesniuUzVidurki {

    public KiekStudentuAukstesniuUzVidurki(){
        System.out.println("ASTUNTA UZDUOTIS!! KIEK STUDENTU KURIE AUSKSTESNI UZ VIDURKI");



        int [] ugiai = {100, 100, 100, 100, 159, 147, 100, 159};



        System.out.println("Aukstesniu studentu nei vidurkis yra: " +studentuUgioVidurkis(ugiai));
    }

    private int studentuUgioVidurkis(int[] u) {
        double vid;
        int suma = 0;
        int kiekis;

        for(int i = 0; i < u.length; i++){
            suma += u[i];
        }

        vid = suma / u.length;
        System.out.println("Vidurkis: " +vid);

        kiekis = kiekStudentuYraAukstesniuUzVidurki(u, vid);

        return kiekis;
    }

    private int kiekStudentuYraAukstesniuUzVidurki(int[] u, double vid) {
        int kiekis = 0;
        for(int i = 0; i < u.length; i++){
            if(u[i] > vid){
                kiekis++;
            }
        }
        return kiekis;
    }
}

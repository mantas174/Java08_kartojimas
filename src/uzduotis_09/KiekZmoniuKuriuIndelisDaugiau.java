package uzduotis_09;

public class KiekZmoniuKuriuIndelisDaugiau {

    public KiekZmoniuKuriuIndelisDaugiau(){
        System.out.println("DEVINTA UZDUOTIS!! KIEK ZMONIU SU INDELIU DIDESNIU NEI 1000");

        int [] indeliai = {1111,1112,1113,987,654,31,1114};

        System.out.println("Zmoniu kuriu idelis didesnis nei 1000: " +kiekiZmoniuSuDideliuIndeliu(indeliai));

    }

    private int kiekiZmoniuSuDideliuIndeliu(int[] indeliai) {
        int kiekis = 0;

        for (int i = 0; i < indeliai.length; i++){
            if(indeliai[i] > 1000){
                kiekis++;
            }
        }

        return kiekis;
    }

}

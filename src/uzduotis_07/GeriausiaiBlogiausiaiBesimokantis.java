package uzduotis_07;

public class GeriausiaiBlogiausiaiBesimokantis {

    public GeriausiaiBlogiausiaiBesimokantis(){
        System.out.println("SEPTINTA UZDUOTIS!! GERIAUSIAI || BLOGIAUSIAI BESIMOKANTIS MOKINYS");

        float [] pazymiai = {9,8,5,2,3,4,2,6,1};
        int geriausiai = 1, blogiausiai = 1;
        float did = pazymiai[0], maz = pazymiai[0];

        for(int i = 1; i < pazymiai.length; i++){
            if(did < pazymiai[i]){
                did = pazymiai[i];
                geriausiai = i + 1;
            }
            if(maz > pazymiai[i]){
                maz = pazymiai[i];
                blogiausiai = i + 1;
            }

        }

        System.out.println("Geriausiai besimokantis mokinys: " +geriausiai+ " jo vidurkis: " +did);
        System.out.println("Blogiausiai besimokantis mokinys: " +blogiausiai+ " jo vidurkis: " +maz);
    }
}

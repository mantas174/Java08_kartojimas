package uzduotis_02;

import java.util.Scanner;

public class TaskaiKoordinaciuPlokstumoje {
    private Taskas [] taskai;

    public TaskaiKoordinaciuPlokstumoje(){
        System.out.println("ANTRA UZDUOTIS !! AR BENT VIENAS TASKAS DUOTO APSKRITIMO VIDUJE");

        duomenuFormavimas();
        arApskritimoViduje();
    }


    //ar bent vienas taskas apskritimo viduje

    public void arApskritimoViduje(){

        // apskritimo centro kordinates a, b ir spindulys r zinomi
        System.out.println("a = 5, b = 4, r = 2");
        int a = 5,
            b = 4,
            r = 2;
        //duota n tasku

        for (int i = 0; i < taskai.length; i++){
            if(taskai[i].getX() >= (a - r) && taskai[i].getX() <= (a + r)){
                if(taskai[i].getY() >= (b - r) && taskai[i].getY() <= (b + r)){
                    System.out.println("Bent vienas taskas yra apskritime");
                }
            }
        }


    }

    public void duomenuFormavimas(){
        int x, y;

        Scanner in = new Scanner(System.in);
        System.out.println("iveskite kiek tasku tikrinsime");
        int n = in.nextInt();
        taskai = new Taskas[n];

        System.out.println("iveskite tasku koordinates x ir y");
        System.out.println("veiks tik jei x 3-7 ir y 2-6");
        for (int i = 0; i < n; i++){

            System.out.print("x: ");
            x = in.nextInt();
            taskai[i].setX(x);

            System.out.print("y: ");
            y = in.nextInt();
            taskai[i].setY(y);
        }
    }
}

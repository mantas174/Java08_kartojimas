package uzduotis_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentaiKurieGeraiMokosi {

    private Scanner _in;
    private String _failoVardas = "10uzduotiesDuomenys.txt";

    public StudentaiKurieGeraiMokosi() {
        System.out.println("DESIMTA UZDUOTIS!! STUDENTAI KURIU VIDURKIS DIDESNIS NEGU VIDUTINIS VISU VIDURKIS");

        ArrayList<StudentuVidurkiai> studentai;
        int kiekis;
        double vidurkis;

        studentai = skaitymasIsFailo();
        vidurkis = studentuVidurkis(studentai);
        System.out.println("Studentu vidurkis: " + vidurkis);
        System.out.println("Studentai kurie mokosi geriau: ");
        kiekis = geruStudentuKiekis(studentai,vidurkis);
        System.out.println("Isviso: " +kiekis);
        geriStudentai(studentai, vidurkis);


    }

    private int geruStudentuKiekis(ArrayList<StudentuVidurkiai> sarasas, double vid) {
        int kiekis = 0;
        for (int i = 0; i < sarasas.size(); i++) {
            if (sarasas.get(i).getVidurkis() >= vid) {
                System.out.println(sarasas.get(i).getVardas() + " jo vidurkis " + sarasas.get(i).getVidurkis());
            }
        }
        return kiekis;
    }

    public double studentuVidurkis(ArrayList<StudentuVidurkiai> sarasas) {
        double suma = 0;
        for (int i = 0; i < sarasas.size(); i++) {
            suma += sarasas.get(i).getVidurkis();
        }
        return suma / sarasas.size();
    }

    public void geriStudentai(ArrayList<StudentuVidurkiai> sarasas, double vid) {

        for (int i = 0; i < sarasas.size(); i++) {
            if (sarasas.get(i).getVidurkis() >= vid) {
                System.out.println(sarasas.get(i).getVardas() + " jo vidurkis " + sarasas.get(i).getVidurkis());
            }
        }

    }



    public void failoAtidarymas() {
        try {

            _in = new Scanner(new File(_failoVardas));
        } catch (FileNotFoundException klaida) {
            klaida.printStackTrace();
            System.out.println("failo atidarymo klaida: ");

        }
    }


    public StudentuVidurkiai pridekStudenta() {
        StudentuVidurkiai result = new StudentuVidurkiai();
        return result;
    }

    public ArrayList<StudentuVidurkiai> skaitymasIsFailo() {
        failoAtidarymas();

        ArrayList<StudentuVidurkiai> result = null;
        StudentuVidurkiai studvid;

        try {
            while (_in.hasNextLine()) {
                studvid = pridekStudenta();
                studvid.setVardas(_in.next());
                studvid.setVidurkis(_in.nextDouble());
                result.add(studvid);
            }
            _in.close();
        } catch (Exception klaida) {
            System.out.println("Skaitymo klaida: ");
            klaida.printStackTrace();
        }

        return result;
    }

}

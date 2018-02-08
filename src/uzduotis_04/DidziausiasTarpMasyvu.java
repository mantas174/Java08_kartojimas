package uzduotis_04;

public class DidziausiasTarpMasyvu {

    private int[] A = {1, 2, 3, 5, 4, 7, 8, 6};
    private int[] B = {1, 2, 3, 7, 8, 9, 6};
    private int kur;

    public DidziausiasTarpMasyvu() {
        //du masyvas A(n) B(m)
        //rasti didziausia per abu
        // ir ji ismesti
        System.out.println("KETVIRTA UZDUOTIS!! DIDZIAUSIO ELEMNTO TARP DVIEJU MASYVU ISMETIMAS");


        System.out.println("Pradiniai masyvai: ");
        System.out.print("A: ");
        spausdinimas(A);
        System.out.print("B: ");
        spausdinimas(B);
        System.out.print("Didziausias skaicius tarp masyvu: ");
        kur = didziausiasTarpMasyvu();

        System.out.println("Pasalintas elementas: ");
        if (A[kur] > B[kur]) {
            pasalintiDidziausia(A, kur);
            System.out.print("A: ");
            spausdinimas(A);
            System.out.println("");
        }
        if (A[kur] < B[kur]) {
            pasalintiDidziausia(B, kur);
            System.out.print("B: ");
            spausdinimas(B);
            System.out.println("");
        }
    }

    public int didziausiasTarpMasyvu() {
        int did = A[0];
        int kur = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > did) {
                did = A[i];
                kur = i;
            }
            for (int j = 0; j < B.length; j++) {
                if (B[j] > did) {
                    did = B[j];
                    kur = j;
                }
            }
        }
        System.out.println(did);
        return kur;
    }

    public void pasalintiDidziausia(int[] masyvas, int kurSkaicius) {
        for (int i = kurSkaicius; i < masyvas.length - 1; i++) {
            masyvas[i] = masyvas[i + 1];
            kur -= 1;
        }
    }

    public void spausdinimas(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        System.out.println();
    }
}

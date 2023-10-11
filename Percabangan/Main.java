package Percabangan;

public class Main {
    public static void main(String[] args) {
        // Artibute
        double a = 13;
        double b = 15;
        double hasil;
        hasil = 0;
        String operasinya = "tambah";
        // Konstruktor
        if (operasinya.equals("tambah")) {
            hasil = a + b;
        } else if (operasinya.equals("kurang")) {
            hasil = a - b;
        } else if (operasinya.equals("pembagian")) {
            hasil = a / b;
        } else {
            System.out.println("Operasi Tidak Valid");
            System.exit(1);
        }
        System.out.println("hasilnya" + " " + hasil);
    }

}

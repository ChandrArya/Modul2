import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Titik titik = new Titik();
        int X = 0, Y = 0;
        int pilihan;
        do {
            System.out.println("MENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIHAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.print("MASUKAN PILIHAN: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nilai X Titik : ");
                    X = input.nextInt();
                    System.out.print("Masukkan Nilai Y Titik : ");
                    Y = input.nextInt();
                    titik.inisialisasiTitik(X, Y);
                    break;
                case 2:
                    titik.tampilTitik();
                    break;
                case 3:
                    System.out.print("Masukkan Nilai Skalar : ");
                    int skalar = input.nextInt();
                    titik.perkalihanSkalar(skalar);
                    titik.tampilTitik();
                    titik.inisialisasiTitik(X, Y);
                    break;
                case 4:
                    titik.pencerminanSumbuX();
                    titik.tampilTitik();
                    titik.inisialisasiTitik(X, Y);
                    break;
                case 5:
                    titik.pencerminanSumbuY();
                    titik.tampilTitik();
                    titik.inisialisasiTitik(X, Y);
                    break;
                case 6:
                    System.out.print("Masukkan Nilai X Titik Kedua : ");
                    int A = input.nextInt();
                    System.out.print("Masukkan Nilai Y Titik Kedua : ");
                    int B = input.nextInt();

                    double jarak = titik.jarak(A,B);
                    System.out.println("Jarak antara Titik Kesatu dan Titik Kedua : " + jarak);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, Silakan pilih lagi.");
            }
            System.out.println("\n\n");
        } while (pilihan != 0);

        input.close();
    }
}
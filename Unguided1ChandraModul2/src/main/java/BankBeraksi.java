import java.util.Scanner;

public class BankBeraksi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int uang = 0;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.print("Saldo saat ini : Rp. ");
        uang = in.nextInt();
        System.out.println();
        Bank chandra = new Bank(uang);
        System.out.print("Simpan Uang : ");
        uang = in.nextInt();
        chandra.simpanUang(uang);
        System.out.println("Saldo saat ini : Rp."+ chandra.getSaldo()+"\n");
        System.out.print("Ambil uang : ");
        uang = in.nextInt();
        chandra.ambilUang(uang);
        System.out.println("Saldo saat ini : Rp."+ chandra.getSaldo());
    }
}
public class Bank {
    private int saldo;

    public Bank(int saldo) {
        this.saldo = saldo;
    }
    public void simpanUang(int uang){
        saldo += uang;
    }
    public void ambilUang(int uang){
        saldo -= uang;
    }
    public int getSaldo() {
        return saldo;
    }
}
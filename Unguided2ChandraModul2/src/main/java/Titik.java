public class Titik {
    private int x;
    private int y;
    public void inisialisasiTitik(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void tampilTitik() {
        System.out.println("Titik = (" + x + ", " + y + ")");
    }
    public void perkalihanSkalar(int skalar) {
        x = x * skalar;
        y = y * skalar;
    }
    public void pencerminanSumbuX() {
        y = -y;
    }
    public void pencerminanSumbuY() {
        x = -x;
    }
    public double jarak(int a, int b) {
        int A = a - x;
        int B = b - y;
        return Math.sqrt(A*A + B*B);
    }
}
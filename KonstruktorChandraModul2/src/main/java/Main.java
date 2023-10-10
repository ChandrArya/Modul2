public class Main
{
    public static void main(String[] args)
    {
        Buku a,b = new Buku();
        a = new Buku(" Siaga Merah "," Alistair Maclean ");
        b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}
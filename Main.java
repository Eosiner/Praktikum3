public class Main {
    public double a;
    public double b;

    /**
     * '
     * constructor untuk objek kelas Main
     * @param a nilai pertama untuk dihitung sesuai artimatika yang akan digunakan
     * @param b nilai pertama untuk dihitung sesuai artimatika yang akan digunakan
     */

    public Main(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     *
     * @return mengembalikan rumus aritmatika dengan nilai dari parameter a dan b
     */
    public double kelilingJajargenjang() {
        return 2 * (a + b);
    }

    public void tampil() {
        System.out.println("rusuk 1 " + a);
        System.out.println("rusuk 2 :" + b);
        System.out.println("keliling jajargenjang : " + kelilingJajargenjang());
    }

    public static void main(String[] args) {
        Main n = new Main(4, 5);
        n.tampil();
    }
}
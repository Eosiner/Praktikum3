public class Main {

        public double a;
        public double b;

        /**
         *
         * @param a
         * @param b
         */

        public Main(double a, double b) {
            this.a = a;
            this.b = b;
        }


        public double kali() {
            return a * b;
        }

        public double bagi() {
            return a / b;
        }

        public double kurang() {
            return a - b;
        }

        public double tambah() {
            return a + b;
        }


        public void tampil() {
            System.out.println("Pertambahan dari" + a + "dan" + b + "adalah :" + tambah());
            System.out.println("Perngurangan dari" + a + "dan" + b + "adalah :" + kurang());
            System.out.println("Perkalian dari" + a + "dan" + b + "adalah :" + kali());
            System.out.println("Pembagian dari" + a + "dan" + b + "adalah :" + bagi());
        }


        public static void main(String[] args) {
            Main k = new Main(100, 2);
            k.tampil();
        }
    }

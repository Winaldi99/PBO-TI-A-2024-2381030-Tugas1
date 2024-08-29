public class TIpeDataValue {
    // array adalah sekumpulan data yang memiliki tipe data yang sama
    public static void main(String[] args) {

        // Cara 1
        Object[] kumpulanNumber; //deklarasi
        kumpulanNumber = new Object[3]; //inisialisasi

        // Cara 2
//        int[] kumpulanNumber2 = new int[3];

        // Cara 3
//        int[] kumpulanNumber3 = new int[] {1, 3, 4, 5};

        // cara memasukan value ke array
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = "Winaldi";
        kumpulanNumber[2] = 20L;

        // cara mengakses
        System.out.println(kumpulanNumber[1]);

    }
}

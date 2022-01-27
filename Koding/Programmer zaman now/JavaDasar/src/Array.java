public class Array {
    public static void main(String[] args) {

        //Array > membuat array tipe data array dan jumlah data array ditentukan diawal;

        String[] arrayString; //cara membuat array pertama;
        arrayString = new String [3];

        // dibawah cara memberi value ke array sesuai index
        arrayString[0] = "ini data pertama";
        arrayString[1] = "ini data kedua";
        arrayString[2] = "ini data ketiga";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "ini data pertama direvisi"; // ini cara ngeset data array
        System.out.println(arrayString[0]);

        String[] arrayString2 = new  String[5]; //cara membuat array kedua;


        // Array initializer // cara lain buat array yg effesien

        int[] arrayInt = new  int[] {    // ini cara buat array yg simple , bebas jumlah datanya.
                12,43,42,34,634,75
        };

        int[] arrayInt2 = {             //atau yg ini lebih simple lagi;
                32,523,34,64,74,7
        };

        System.out.println(arrayInt.length);

        //tidak ada proses menghapus data array yg ada hanya bisa set data ke null;

        arrayString[0] = null; // seperti ini.


        //Array Multi dimensi / Array dalam Array

        String [][] ArrayGab = {
                {"eko", "budi"},
                {"anto", "ani"},
                {"rudi"}
        };

        System.out.println(ArrayGab[0][1]); //mengakses budi; //akses array dalam array
        System.out.println(ArrayGab[1][1]); //menakses ani;





    }
}

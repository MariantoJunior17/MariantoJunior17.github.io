package JavaDasar;

public class Method {
    public static void main(String[] args) { // ini juga termasuk methode . main

        int x = 5;
        int y = Hitung(x);
        System.out.println(y);
        int hasil = funsiRekursif(5);
        System.out.println(hasil);

        overloadFun(34); //kita buat methode yang sama tapi beda parameter biar bisa dipanggil dengan banyak tipe data,
        overloadFun(43.2f);

    }

    public static int Hitung (int input) { // ini namanya methode atau fungsi
        int hasil;
        hasil = input * input;
        return hasil;
         /*  public ==> validitas (bisa diakses antar kelas )
            static ===> karna di methode utama (main static) jadi methode semuanya harus bersifat static
            int ===> bisa dihilangkan ,tapi karna ada return value, methode harus didefinisikan tipe datanya agar returnya jelas
            void ==> itu artinya hampa,(melakukan kegiatan/perintahs saja seperti print,dll, dan bukan melakukan perhitungan, artinya sebuah fungsi /methode, yang tidak mengembalikan apapun (tidak mengunakan return)

        */
    };

    private static int funsiRekursif (int faktorial) { // ini contoh fungsi rekursif
        if (faktorial == 1){
            return 1;
        }
        return faktorial * funsiRekursif(faktorial - 1); //returnya memanggil fungsi itu sendiri
    }

    // Overload Methode ==buat methode yang sama tapi beda parameter

    private static void overloadFun (int parameterInt) { //ini ga gagal karna tipe data parameter berbeda;
        System.out.println(parameterInt);
    }
    private static void overloadFun (float parameterFloat) {  //ini ga gagal karna tipe data parameter berbeda;
        System.out.println(parameterFloat);
    }

}

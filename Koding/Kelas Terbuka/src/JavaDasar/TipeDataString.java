package JavaDasar;

import java.util.Locale;

public class TipeDataString {
    public static void main(String[] args) {
        //String #
//        String kata = "Ini String";
//        System.out.println(kata);
        //mengakses kata dari String (String adalah kumpulan char);
//        System.out.println(kata.charAt(4));

        //Merubah Komponen (String itu Immutable,)
//         kata = kata.substring(1,7); //INI BUKAN MENGUBAH STRING ,ini buat dua var kata, jika dicek lagi akan ada 2 memory kata berbeda;
//        System.out.println(kata);

        //mengabungkan String
//        kata = "aku ini string" + kata; //ini ditaruh di string pool
//        System.out.println(kata);

        //Lowercase dan UpperCase
//        System.out.println(kata.toLowerCase());
//        System.out.println(kata.toUpperCase());

        //replace
//        System.out.println(kata.replace("aku",""));

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //equality == Persamaan (sering salah)
        //contoh

            //kasus pertama
//                String kataInput = "test"; // ini string literal ,diisi langsung dan masuk memory pool
//                String katatest = "test"; // masuk memory pool;dan hasil if sma
            //kasus kedua
//                  String kataInput = new String("test"); // ini tidak masuk memory string pool;
//                  String katatest = "test"; // ini masuk memory string pool, karna memory nya berbeda jadi hasil if jadi false
            //

//            if (kataInput == katatest) {
//            System.out.println("sama");
//        } else {
//            System.out.println("beda");
//        }
        //contoh diatas berbeda karna persamaanya dari accuan adrees momory, kalau mau cari dari accuan value pake methode
//        if (kataInput.equals(katatest)){ // pakai methode equal untuk cari persamaan dengan accuan valuenya bukan adress memory
//            System.out.println("benar");
//        }else {
//            System.out.println("salah");
//        }

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //comparasi (berdasarkan alpabetic nya )
//        String motor_1 = "marianto";
//        String motor_2 = "ebidin";
//        System.out.println(motor_1.compareTo(motor_2)); //hasilnya akan 8, artinya kata pertama (M dan E, ada 8 step;



    }
}

package JavaDasar;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Arraaay {
    public static void main(String[] args) {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // array adalah kumpulan data =>>>>>> (memory heap)
        //tipe data [] = nama = {...}
//        int []  arrInt = {1,2,3,4,5};
//        System.out.println(arrInt[2]); //mengakses datanya dengan index;
//
//        //kalo mau akses semua data pake kelas helper;(array)
//        System.out.println(Arrays.toString(arrInt));
//
//        //Deklarasi Array ==>>> tipedata [] nama = new tipedata [];
//        float [] arrFloat = new float [7];  // 7disini artinya jumlah data di array yg dibuat;

        // Cara isi data ke array
//        arrFloat[2] = 34.3f;
//        System.out.println(arrFloat[2]);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //#Looping array;
            //Looping Standard
//            for( int i = 0; i <arrInt.length ;i++){
//                System.out.println("index ke " +  " adalah " + arrInt[i]);
//            }
//
//            //Looping foreach
//            //cara kerjanya ambil 1 tampilkan 1, ambil 1 lagi ,tampilkan lagi , jadi angka itu tampilkan berulang tapi nilai nya berubah ubah;
//            for ( int angka : arrInt) { // disini angka, itu sebagai setiap 1, element di arrInt jadi variable angka (valuenya berubah ubah)
//                System.out.println(angka);
//            }

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Operasi Pada Array
        // int [] arrayAngka = {1,2,3,4,5,6,7,8,9,};
        //     int [] arrayAngka1 = new int[9];

        //Cara mengkopy array
            //.1.Cara Looping
            // for (int i = 0; i < arrayAngka.length; i++){
            //     arrayAngka1[i] = arrayAngka[i]; // copy pake loop disini ga copy dengan pass by value karna adrees memorynya tetap berbeda
            // }

            // printArray(arrayAngka);
            // System.out.println(arrayAngka);
            // printArray(arrayAngka1);
            // System.out.println(arrayAngka1);
            // //.2 Cara Copy of;
            // int [] arrayAngka3 = Arrays.copyOf(arrayAngka,4); // copy 4 data aja dari arrayAngka;
            // printArray(arrayAngka3);
            // //.3. Copy of Range (dengan range mulai dari dan sampai dari)
            // int [] arrayAngka4 = Arrays.copyOfRange(arrayAngka,2,5); // copy dari index 2 sampai 4, yg akhir ga dihitung
            // printArray(arrayAngka4);
        //Fill Array ==>>> fill.
        //Komparasi Array equal,mismatch, compare

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Array multi dimensi

        int [][] array_2d = {{3,5,3},{4,5,3}};
        System.out.println(Arrays.deepToString(array_2d));


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Latihan Operasi Matrik


    }

    private static void printArray (int [] dataArray) {
        System.out.println(Arrays.toString(dataArray));
    }
}

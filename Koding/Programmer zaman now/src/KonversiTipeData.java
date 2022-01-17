public class KonversiTipeData  {

    public static void main(String[] args) {
        //konversi tipe data

        byte iniByte = 23;
        short iniShort = iniByte;  //ini dari short ke byte = bisa
        int iniInt = iniShort;


        //beda cerita klo kebalikanya

        int iniInt2 = 1000;

        byte iniByte2 =  (byte) iniInt2; //ini dari byte ke int == ga bisa/ atau bisa tapi pake konversi (byte)/
        //datanya dari -128 ke 127 putar lg dari -128 dan seterusnya samapi behenti di puttaran ke 1000;

        //tipe data karakter

        char e = 'e'; // tipe data char .
        char k = 'k';

        System.out.println(e);
        System.out.println(k);

        //tipe data booolea (benar/salah);

        boolean benar = true; // tipe data boolean
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);


        //tipe data String (teks)

        String firstName = "Marianto"; // tipe data String // pake S besar .
        String lastName = "Junior";

        String fullName = firstName +" " + lastName;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);


        //variable

        String name ;  // variable nama tipe data string
        name = "Ganteng coi gw";

        int age = 30;  //variable age tipe data int
        String address = "indonesia";

        int defaultint; //default valunya 0
        String defaultStr; // default valuenya null klo string

        name = "budi"; // bisa diganti value variable

//        name = 100; // ini tidak berhasil karna tipe data dari variable name (ditentukan diawal adalah String jadi ga bisa dioverwrite dengan tipe data int

        System.out.println(name);



        //Kata kunci Var  //wajib isi value saat dideklarasikan
        var g = 12;
//        var h;  // ini ga bisa karna ga ada valuenya ,harus ada value langsung

        //kata kunci final ; ga bisa diubah value dari variable jadi kita kunci pake final

         final String nama12 = "andi";
//         nama12 = "fddf";  ||yang ini error

        //tipe data primitif dan bukan primitif

        /*
        Jadi tipe data primitif itu selalu punya default value,
        sedangkan yang bukan primitif bisa dilihat dari default valuenya yg null;

        tipe data primitif itu ga bisa diubah,
        tipe data bukan primitif bersifat object, dan bisa ada melekat methode .atau function

        PRIMITIF ||||| BUKAN PRIMITIF

        byte            Byte
        short           Short
        int             Integer

        dan seterusnya, cumna beda di huruf depan,

         */

        //tipe data bukan primitif

        Integer angka12 = 32;
        Short short23 = 23;

        Byte iniByteNP = null; // ciri ciri bukan primitif nilainya null
        System.out.println(iniByteNP);


        //konversi primitif ke bukan primiif
        int prim = 13;

        Integer noprim = prim;

        //dari bukan primitif ke primitif
        short inishorttt = noprim.shortValue(); // nah karna Integer bukan primitif ,jadi punya methode Shortvalue, jadi masuk akal kan



    }






}

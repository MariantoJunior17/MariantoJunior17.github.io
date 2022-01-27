package JavaDasar;

public class OperatorAritmatika {
    public static void main(String[] args) {
        //Operasi Aritmatika ( + , - , / , * , % )

//        int a = 1;
//        int b = 2;
//        int hasil;
//
//        hasil = a + b;
//        System.out.println(hasil);
//
//
//        //pake cara print format
//        hasil = a - b;
//        System.out.printf("%d - %d = %d \n",a,b,hasil); // ini cara pake printf kita buat alurnya dulu dalam string (""), lalu kita sertakan komponen variablenya dengan koma


        // Konversi Data (

        int nilaiInt = 450; //32 bit

        //#memperluas ke nilai lebih besar (>)
        long nilaiLong = nilaiInt; // karna dari nilai yang kecil KE besar ,, ga akan ada masalah ;
        System.out.println(nilaiLong);

        //#memperkecil ke nilai yang lebih kecil (<)
        // byte nilaibyte = nilaiInt; // klo begini akan error jadi kita harus casting dulu
        byte nilaibyte = (byte) nilaiInt;
        System.out.println(nilaibyte); // => -62. nilainya jadi aneh karna maxnya 128 jadi,akan perputar terus hinggan ke putarn 450 = -62


        //#Casting Pembagian

//        int x = 10;
        float x = 4.5f;
        int y = 20; // ini gagal karna ga bisa inter ke float langsung,(float + int = float => itu bisa;
        float result = x + y;
        System.out.printf("%f + %d = %f \n",x,y,result);

        //cara lain

        int a = 10;
        int b = 3;
        float hasil = (float) a + b;
        System.out.printf("%d + %d = %f \n",a,b,hasil);




    }
}

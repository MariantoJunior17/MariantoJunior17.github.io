public class Method {
    public static void main(String[] args) {
        sayHello();

        System.out.println(sum(23,42));
        int result = sum(23,23);
        int[] fdd = {32,32,32,23};
        Config("fd", fdd);
        Config("Fdfd", 32,32,23,2);


    }


    static  void  sayHello () { //karna function/methode sayHello dijalankan di main, yang bersifat static otomatis sayhello juga harus bersifat static
        System.out.println("hello");
    }

    // function yang mengunakan return atau mengembalikan nilai

    static int sum (int value1, int value2) { // karna mengebalikan value atau return jadi yang void diubah sesuai tipe data return, klo disini returnya int jadi void juga diganti int
        return value1 + value2 ;
    }

    //Methode variable argument

    static void Config (String nama, int... values) { //variable argumen ... parameternya dalam bentuk array
        int total = 0;
        for ( var value : values) {
            total += value;
        }

        var totolValue = total > 23;
        if (totolValue) {
            System.out.println("kamu lulus" + nama);

        }else {
            System.out.println("gagal" + nama);
        }
    }

    //methode overloading
    //nama methode boleh sama asal paramter dan tipe parameterya berbeda

    static void  sayBye() {
        System.out.println("bye");
    }

    static void  sayBye(String firstName) { //lihat namanya methodenya boleh sma;
        System.out.println("Bye" + firstName);

    }





}

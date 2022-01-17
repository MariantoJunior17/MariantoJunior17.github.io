public class TipeDataNumber {

    public static void main(String[] args) {

        //tipe data di java
        byte iniByte =100; //Kapasitas -128 > 127
        short iniShort = 133;
        int iniInt = 224;
        long inilong1 = 13223;
        long inilong2 = 232323L;

        //FLoating point number
        float iniFloat = 13.23F; /// yang float perlu F sma kek Long,
        double iniDouble = 232.323;

        //interger Literal
        //bisa juga buat angka hexadesimal dan binary loh; tpi ga dipakek keknya

        int desimalInt = 24;
        int hexaDesimal = 0xffffff;
        int binaryDesimal = 0b10101010;

        //Underscore //bantu kita buat baca sebuah angka. dan ga ngaruh ke datanya

        int amount = 1000000000; //bacanya susah
        int amount2 = 100_000_00; // klo ini lebih enak dibaca

        //konversi tipe data

        //widening casting ?byte short> int> long >>sampai ke double //ini dibantu system (otomatis)
        //narowing casting double float long smapai ke byte // ini manual dari kita




    }
}

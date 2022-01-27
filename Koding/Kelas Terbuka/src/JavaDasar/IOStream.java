package JavaDasar;

import java.io.FileInputStream;

public class IOStream {
    public static void main(String[] args) throws java.lang.Exception { // kita throws error dari main methode
        //Pengenalan IO Steram
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //fileinputStream

        FileInputStream inputfile = new FileInputStream("index.txt"); //class helper untuk inputOutput ( fileinputStream )
        //fileinputstream mamasukan file kedalam system;
//        System.out.println((char)(inputfile.read()));// membaca file; //kita konvesi ke karakter
//        System.out.println(inputfile.read()); // ini hasilnya anggka 97 tpi klo jadikan char jadi "a"; artinya ini bermain dengan satuan byte;
//        System.out.println((char)(inputfile.read()));// membaca file;        System.out.println((char)(inputfile.read()));// membaca file;
//        System.out.println((char)(inputfile.read()));// membaca file;

            //fileinputstream mengunakan byte

            //menutup file
//        inputfile.close();// jika sudah dibuka kita tutup (sebaiknya) untuk mengurangi memmory;


        System.out.println("Program Selesai");

        while (inputfile.read() != -1) {
            System.out.println((char)inputfile.read()); //gagal
        }
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>..
        //FIleOutputStream

        //Byte Stream = fileinputStream/fileOutputStream;
        //Charater Stream = FileReader /FileWriter;

        //(Byte Stream dan Charater Stream (akses perbyte ,atau 1 1 char) jadi tidak effectif:

        //BufferByteStream = bufferInputStream/bufferoutputStream / =>>membaca dari memory jadi lebih cepat


    }
}

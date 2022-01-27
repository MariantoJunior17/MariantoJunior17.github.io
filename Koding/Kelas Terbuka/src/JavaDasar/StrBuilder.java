package JavaDasar;

public class StrBuilder {
    public static void main(String[] args) {

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //String Builder (class helper untuk buat string)
        StringBuilder buider = new StringBuilder("hallo"); // String dan StringBuilder sama saja cuman String Builder punya fasilitas lain;

        System.out.println(buider);
        System.out.println(buider.length());
        System.out.println(buider.capacity()); // ada fasilitas cappacity (defaultnya 16 + hallo = 21);
        //cek adress StringBuilder
        System.out.println(Integer.toHexString((System.identityHashCode(buider)))); // ini addres momory
        //kita ubah dan cek momory lagi
        buider.append(" Semuanya");
        System.out.println(buider);
        System.out.println(Integer.toHexString((System.identityHashCode(buider)))); // ini addres momory

        /*  jika pake StringBuilder, String yang diubah,ditambah,dikurang, maka addres nya tidak akan berubah;
            jika pake String = new String ==> sebaliknya addres nya berubah;
        */


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Fitur Insert

        buider.insert(0,"==> ");
        System.out.println(buider);

        //Delete;
        buider.delete(0,3);
        System.out.println(buider);

        //mengubah charat
        buider.setCharAt(1,'H');
        System.out.println(buider);

        //ada replace, dll

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //Casting StringBuider to String
        String kalimat = buider.toString(); // casting
        System.out.println(kalimat);
        System.out.println(Integer.toHexString((System.identityHashCode(kalimat)))); // ini addres momory



    }
}

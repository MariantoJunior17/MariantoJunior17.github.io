package JavaDasar;

public class TypeData {
    public static void  main (String[] args) {
        //Tipe Data
        //integer, byte, short , long , double, char , boolean (tipe data primitif = gabisa di ubah udh fix)

        //# integer => satuan / nilai bulat

        int i = 10; // satuan dan tidak ada koma,
        System.out.println(i);
        System.out.println("<<<<===>>>>");
        System.out.println("nilai max int =" + Integer.MAX_VALUE);
        System.out.println("nilai min int =" + Integer.MIN_VALUE);
        System.out.println("nilai  int =" + Integer.SIZE);
        System.out.println("nilai  int =" + Integer.BYTES);
      //Cara hitung = 2^32bit -1 = dibagi 2 untuk area minus dan positif dpt 2.147xxxxxxxxxxx

        //# Byte
        byte b = 10; // satuan dan tidak ada koma,
        System.out.println(i);
        System.out.println("<<<<===>>>>");
        System.out.println("nilai max int =" + Byte.MAX_VALUE);
        System.out.println("nilai min int =" + Byte.MIN_VALUE);
        System.out.println("nilai  int =" + Byte.SIZE);
        System.out.println("nilai  int =" + Byte.BYTES);

        //Satuan
        short s = 10; // ini short 16 bit
        long l = 10l; // ini long harus pake l, 64bit

        //#koma , desimal;
        float f = 19.4f; // iini bisa koma pake f, 32 bit
        double d = 23.2d; // ini bisa koma pake d, 64 bit

        //penkondisian
        boolean bo = true; // ini 1 bit,

        //Charater
        char c = 't'; // pake tanda kutip 1, 16 bit// berdasarkan asci code







    }
}

package JavaDasar;

public class OperatorUnary {
    public static void main(String[] args) {
        // Increment , Decrement (++, -- , !=)
        // unary => operasi pada 1 variable , diri sendiri

        int angka1 = 1;
        System.out.println(-angka1);
        angka1++; // angka = angka + 1
        System.out.println(angka1);

        int angka2 = 9;
        angka2--;

        //ada dua penulisan a++(postfix) ++a(prefix)
        System.out.println(angka2);

        //Bolean unary => != (negasi)
        boolean ini = true;
        System.out.println(!ini);

    }
}

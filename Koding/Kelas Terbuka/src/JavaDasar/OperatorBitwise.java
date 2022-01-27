package JavaDasar;

public class OperatorBitwise {
    public static void main(String[] args) {
        //Operator bitwise adalah operator untuk melakukan operasi pada nilai bit

        byte b =8;
//  \
        String b_byts;

        b_byts = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_byts,b);
    }
}

package JavaDasar;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Scanner = > input User secara bebas

        //#program Hitung Luas
        Scanner inputUser = new Scanner(System.in); // bikin scanner .
        int inputPanjang = inputUser.nextInt(); // buat var integer lallu diparsing (==), nilainya diambil dari  fasilitas inputUser;;
        int inputLebar = inputUser.nextInt();

        int luas = inputPanjang * inputLebar;

        System.out.println("luas dari " + inputPanjang + " x "+ inputLebar + "==" + luas);



    }
}

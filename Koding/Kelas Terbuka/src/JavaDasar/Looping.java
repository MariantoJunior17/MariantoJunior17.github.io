package JavaDasar;

import java.util.Scanner;

public class Looping {
    public  static  void main(String[] args) {
        //Pengulangan (while, do while, for , rekursif);;
        // keyword (break; =>>> keluar dari looping, continiu ==>>> skip hasil saat ini(saat mengerjakan proses), return ===>>> mengembalikan value)

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //WHILE LOOP
//        int nilai = 0;
//        while(nilai <= 5) {
//            nilai++;
//            System.out.println("ini looping while " + nilai);
//        }

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //DO WHILE LOOP

//        do {
//            System.out.println(" do while minimal dilakukan sekali");
//        } while (false);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        //FOR
//
//        for(int value = 0; value <=5; value++){
//            System.out.println("ini looping pake for " + value);
//        }


        //PROGRAM MENGHITUNG DERET FIBONACI

//        int f_n,f_n2,f_n1,n;
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Masukan max deretan yang dicari : ");
//        n = userInput.nextInt();
//
//        f_n1 = 1;
//        f_n2 = 0;
//        f_n = 1;
//
//        for(int i = 1; i <= n; i++) {
//            System.out.println("nilai ke - " + i + " adalah " + f_n );
//            f_n = f_n1 + f_n2;
//            f_n2 = f_n1;
//            f_n1 = f_n;
//        }
        //#Latihan Looping bersarang;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++) {
                System.out.print("0 ");

            }
            System.out.print("\n");
        }
        System.out.print("\n");
        //=============================================
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++) {
                System.out.print("0 ");
                if( i == j){
                    break;
                }

            }
            System.out.print("\n");
        }
        System.out.print("\n");
        //===========================================
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++) {
                System.out.print("0 ");
                if((i + j == 3)) {
                    break;
                }

            }
            System.out.print("\n");
        }

    }
}

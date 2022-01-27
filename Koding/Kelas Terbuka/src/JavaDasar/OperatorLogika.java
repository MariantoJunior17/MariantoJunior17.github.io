package JavaDasar;

import java.util.Scanner;
public class OperatorLogika {
    public static void main(String[] args) {

        //#buat Scanner
        Scanner inputUser = new Scanner(System.in);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Operator Logika ( and , or ,negasi) => %% , || , !=, (^ => operator xor)

//        boolean a = true;
//        boolean b = false;
//        boolean c;
//        c = (a && b);
//        System.out.println(c);


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //#PROGRAMM TEBAK NILAI
//
//        int nilaiBenar = 6;
//        int nilaiTebakan;
//        boolean statusTebakan;
//
//        System.out.println("Masukan Nilai Tebakan Diantara 1 ... 10");
//        nilaiTebakan = inputUser.nextInt();
//        statusTebakan = (nilaiTebakan == nilaiBenar);
//        System.out.println("Nilai Tebakan Anda : " + statusTebakan);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //iF STATEMENT ( if else, if else if , dan if nested )

//        int nilai = 10;
//        if (nilai == 10) {
//            if (nilai >= 10) {
//                System.out.println("Ini masuk ke If nasted");
//            }else {
//                System.out.println("ini if nasted false");
//            }
//        }else if(nilai > 10) {
//            System.out.println("ini if else if");
//        }else {
//            System.out.println("ini default jiga 2 syarat gagal");
//        }

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Switch Case // Seperti if tapi lebih simple

//        System.out.println("Pilih salah satu ( A, B, C)");
//        String input = inputUser.next();
//
//        switch (input){
//            case "A":
//                System.out.println("Pilih A");
//                break; // break untuk keluar conditional switch (karna hasil yang diinginkan hanya 1 )
//            case "B":
//                System.out.println("Pilih B");
//                break;
//            case "C":
//                System.out.println("Pilih C");
//                break;
//            default: // default juga bisa diset agar ada hasil default
//                System.out.println("diluar Pilihan");
//        }

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Ternary Operator => if yang lebih singkat (if sederhana)
        // variabel x = espresi ? statementTrue : statementFalse;
//
//        int x, input;
//        input = inputUser.nextInt();
//
//        x = (input == 10) ? input*input : input/2; //ini format atau syntac dari ternary oparato hanya ada (true atau false)
//        System.out.println(x);


    }
}

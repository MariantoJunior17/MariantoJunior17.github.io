public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;


        //Operasi di Java
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Augmented Assigmetn

        a += 22; // >> artinya a = a + 10; begitupun seterusnya

        System.out.println(a);

        //Unary operator

        a++; // a = a + 1
        a++; // a = a + 1

        a--; // kebalikannya dan ad juga [-, + , dan !(negasi) ]

        System.out.println(a);


        //operasi perbandingan

        // ada [> , < >=, <= ,]

        int x = 100;
        int y = 100;

        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x < y);
        System.out.println(x != y);



        //Operasi Boolean // (||, && dan !) and | or .lu udh tau lah;;

        var absen = 80;
        var nilaiAkhir = 90;

        boolean lulusAbsen = absen > 85;
        boolean lulusNilaiAkhir = nilaiAkhir >80;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

        var lulus2 = lulusAbsen || lulusNilaiAkhir;
        System.out.println(lulus2);

        //ekspresstion > stetement > block //cuman definsi aja

        // if Statement

        var angka = 14;
        var seleksi = 14;

        if (angka > seleksi ) {
            System.out.println("nilai angka lebih besar");
        } else if ( angka == seleksi ) {
            System.out.println("nilai angka sama besar");
        }
        else {
            System.out.println("nilai angka  tidak lebih besar");

        }

        // Switch Statement

         var valuee = "B";

        switch (valuee) {
            case "A":
                System.out.println("anda dapat nilai A");
                break;
            case "B":
            case "C":
                System.out.println("anda dapat nilai B / C");
                break;
            case "D":
                System.out.println("anda dapat nilai D");
                break;
            default:
                System.out.println("tidak ada yg benar");
        }

        //Switch Lambda //terobosan lebih ringkas

        var valueee = "T";
        switch (valueee) {
            case "A" -> System.out.println("ini nilai A");
            case "B" -> System.out.println("ini nilai B");
            case "C" -> System.out.println("ini nilai C");
            case "D" -> System.out.println("ini nilai D");
            default -> {
                System.out.println("klo mau 2 baris pake {} ");
                System.out.println("ini lebih ringkas coi");
            }

        }
        // kata kunci yield

        //yang ini tanpa yield
        var val = "T";
        String ucapan =  // ucapan di tulis banyak
        switch (val) {
            case "A" -> ucapan = ("ini nilai A");
            case "B" -> ucapan = ("ini nilai B");
            case "C" -> ucapan = ("ini nilai C");
            case "D" -> ucapan = ("ini nilai D");
            default -> "fdfd";




        };


       // dengan yield persingkat yg diatas
        var Tat = "H";
        String ucap = switch (val) { // ucap nya bisa berubah sesuai switch mana yg dapat true;
            case "A":
                yield "dapat A"; //yield mirip return lah
            case "B":
                yield "dapat A";
            case "C":
                yield "dapat A";
            case "D":
                yield "dapat A";
            default:
                yield "faadfdf";
        };

        //ternary operator .kondisi if yg singkat cuman ada benar salah

        var nilaaai = 76; // yang contoh pake iff panjang kan
        if (nilaaai == 76 ) {
            System.out.println("lulus");
        } else  {
            System.out.println("gagal");
        }


        //alternatifnya tenary

        var nillai = 65; // ini lebih ringkas dari yg diatas
        String ucapp = nillai > 34 ? "kamu lulus": "kamu gagal";

        System.out.println(ucapp);

    }
}

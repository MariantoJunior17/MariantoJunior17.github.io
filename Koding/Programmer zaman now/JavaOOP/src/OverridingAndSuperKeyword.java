class Shape {
    int getconer () {
        return 0;
    }
}

class Retangle extends Shape { // ini child class dari parent Class (shape)
    //karna child class ,jadi kita bisa akses methode di Class (Shape)
    // kita akses methode getcorner dari class(shape) tpi karna di kelas ini juga ada , jadi jika diakses maka dia akan mencari di class nya sendiri dulu
    //maka methode yang diambil adalah dari kelas sendiri;
    int getconer () {
        return 5;
    }

    int getparentcorner () {
        return super.getconer();
    }
}


public class OverridingAndSuperKeyword {
    public static void main(String[] args) {
        Retangle persegiPanjang = new Retangle();
        int hasil = persegiPanjang.getconer();  //
        // jadi methode get corner ada 2 ( di chidl dan perent ) ,saat child pangil methode tersebut
        // maka yg diambil adalah dari kelas sendiri dulu//// karna sudah ada juga ( prioritas dikelas sendiri )
        //ini dinamakan methode overriding
        System.out.println(hasil);

        //klo mau dari methode parent pakai keyword super

        hasil = persegiPanjang.getparentcorner(); //pake kata kunci super, kita akalin buat methode baru juga ;
        System.out.println(hasil);
    }
}

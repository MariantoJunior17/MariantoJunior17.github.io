
class Binatang {
    String nama;
    String type;

    Binatang (String namaHewan, String typeHidup) { // ini construtor funtion harus sesuai nama Class ;
        nama = namaHewan;
        type = typeHidup;
    }

    Binatang (String namaHewan) {
        this(namaHewan,null);
    }

    Binatang() { // Constructor juga bisa dibuat overloading ,(nama sama tapi parameter berbeda;) jadi sekarang ada 2 opsi mau disi langsung atau nanti;
        this(null,null);
    }

}


class Person {
    String nama ; // ini variable , property , prototype atau data,

    private  static  void  sayhello () {  // ini methode
    }

}


public class PengenalanClass {


    public static void main(String[] args) {
        /*
        * Pengenalan Class , class itu seperti sebuah blueprint (cetakan untuk kumpulan objeck yang serupa
        * misalanya diatas saya buat class (person) ,person pasti punya nama dan kita buat property nama di kelas,
        * lalu di main methode kita inisialisasi object dari class person , nah object itu pasti mewarisi property nama ,jadi benar
        * jika class adalah sebagai blueprint */

        Person orang1 = new Person(); // kita buat object orang1 dari kelas ,otomatis orang1 punya property nama
        orang1.nama = "ebidin"; //kit akses namanya dan kita beri nilai;
        System.out.println(orang1.nama);

        //selain property object juga mewarisi methode, hubungan class dan object adalah seperti dibawah ini;

        String tulisan = new String("tuisan"); // class halper String dan variable tulisan ( var tulisan bertipe data String)
        Person orang2 = new Person(); // ibaratkan saja  orang2 (object) yang bertype (class) person;

        //Contructor ==> adalah methode yang pertama kali dipanggil saat pembuat object , methode Contructor harus sma dengan nama Classnya
//        orang1.nama = "ebidin"; // dicontoh setelah buat object kita harus ngeset nama itu manual, dan 1 1 , jadi tidak efektif;

        Binatang ayam = new Binatang("ayam", "darat"); // ini property nama dan type akan langsung melekat saat object ayam dibuat, tidak seperti diatas yang harus diset manual;
        System.out.println(ayam.nama);
        System.out.println(ayam.type);

        Binatang cicak = new Binatang(); // ini hasil dari consturtor overloading diatas //
    }
}

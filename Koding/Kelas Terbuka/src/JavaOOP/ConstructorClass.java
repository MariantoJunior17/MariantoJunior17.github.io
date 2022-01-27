package JavaOOP;

class Mahhasiswa {
    String nama;
    int nilai;

    Mahhasiswa (String inputNama, int inputNilai) { // ini adalah methode, atau countructor funtion
        nama = inputNama;
        nilai = inputNilai;
    }
}

public class ConstructorClass {
    public static void main(String[] args) {

        //buat object dengan contructor funtion

        Mahhasiswa mhs1 = new Mahhasiswa("udin", 13);
        System.out.println(mhs1.nama);
        System.out.println(mhs1.nilai);

    }



}

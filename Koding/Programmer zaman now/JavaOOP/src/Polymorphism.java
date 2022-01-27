class CEO {
    String nama;


    void showNama (String inputNama) {
        this.nama = inputNama;
        System.out.println("nama CEO adalah" + this.nama);
    }
}

class Manager  extends  CEO{

    void showNama (String inputNama) {
        super.nama = inputNama;
        System.out.println("nama CEO adalah" + super.nama);
    }

}

class Karyawan extends  Manager {

    void showNama (String inputNama) {
        super.nama = inputNama;
        System.out.println("nama CEO adalah" + super.nama);
    }

}


public class Polymorphism {
    public static void main(String[] args) {
        //Polymorphism ==> berubah bentuk (berkaitan dengan iheritance


        //diatas child > parent > grandparent

        //P

        CEO ceo = new CEO();

        //binggung guys
    }
}

class Parent { // ini class Parent ,,kelas ini yang membagikan property dan methodenya ke kelas lain
    String nama;
    int age;
    void sayHello (String fullname) {
        System.out.println("Hello " + fullname);
    }
}

class Child  extends Parent { // ini class child , kita (extends) ke parent
    //sehingan kelas ini mewarisi property dan methode ini juga( nama, age dan sayhello)
                                                        //    String -> nama;
                                                        //    int -> age;
                                                        //    void  -> sayHello
}

public class Inheritance {

    public static void main(String[] args) {
        //Inheritance ==> pewarisan property dan methode (dari parent ke child (class));

        Parent iniParent = new Parent();
        iniParent.nama = "namaParent";
        iniParent.age = 23;

        Child iniChild = new Child();
        iniChild.nama = "marianto"; //ini proprty nama, kita ambil dari kelas parent
        System.out.println(iniChild.nama);


    }
}

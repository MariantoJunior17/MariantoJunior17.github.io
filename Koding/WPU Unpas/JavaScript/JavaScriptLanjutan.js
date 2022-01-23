//Cara membuat Object di javaScript 

//1.Object Literal 
//membuat 1 1 jadi ga efektif jika datanya banyak,
    // let mahasiswa = {
    //     nama : "Marianto",
    //     energy : 10,
    //     makan : function (porsi) {
    //         this.energy += porsi;
    //         console.log(`energy bertambah ${porsi}`)
    //     }
    // };

//2.function Delaration
//efektif untuk bikin object serupa yg banyak karna sebagai blurprint ,dan juga harus menyertakan return, karna sebagai blueprint lagi

    // function Mahasiswa (nama , energy) {
    //     let mahasiswa = {};
    //     mahasiswa.nama = nama;
    //     mahasiswa.energy = energy;

    //     mahasiswa.makan = function (porsi) {
    //         mahasiswa.energy += porsi;
    //         console.log(`energy bertambah ${porsi}`)
    //     }

    //     return mahasiswa; // harus ada return ny untuk Function Declaration karna ini sebagai blueprint , kita buat objeck saat menjalankan function nya

    // }

    // let doddy = Mahasiswa("doddy" ,12); //untuk buat lagi, tingal panggil lagi
    // let ebidin = Mahasiswa("ebidin" , 14);

//3.Constructor Function // sama dengan funciton declaration hanya saja lebih singkat
// bedanya nya 

//   function Mahasiswa (nama , energy) {
//        // // let mahasiswa = {}; // bedanya  ( let mahasiswa ) tidak diperlukan diganti dengan variable global ,this,
//         this.nama = nama;
//         this.energy = energy;

//         this.makan = function (porsi) {
//             this.energy += porsi;
//             console.log(`energy bertambah ${porsi}`)
//         }
//        // // return mahasiswa; // return juga tidak di perlukan
//     }

//     let doddy = new Mahasiswa("doddy" ,12); // kita perlu key word new 
//     let ebidin =  Mahasiswa("ebidin" , 14); // harus pake keyword new


//. 4 Konsep Object.create  ini untuk menghubungkna 2 object a dan b dan kita ambil isi dari b untuk digunakan oleh si a

    // ada 2 object (methde mahasiswa dan Mahasiswa) dan  kita transfer methode tidur 
    // const methodeMahasiswa = {  
    //     tidur : function (jam) {
    //         this.energy +=  jam * 2;
    //     }
    // }

    // function Mahasiswa (nama , energy) {
    //    // // let mahasiswa = {};        // let mahasiswa = {};  dan let mahasiswa = Object.create(methodeMahasiswa);  itu sama aja beda nya object.creat kita jadi ada fitur saling tranfer, atau inheritance
    //     let mahasiswa = Object.create(methodeMahasiswa); 
    //     mahasiswa.nama = nama;
    //     mahasiswa.energy = energy;

    //     mahasiswa.makan = function (porsi) {
    //         mahasiswa.energy += porsi;
    //         console.log(`energy bertambah ${porsi}`)
    //     }

    //     return mahasiswa;
    // }

    // let doddy = Mahasiswa("doddy" ,12); 
    // let ebidin = Mahasiswa("ebidin" , 14);

//5. Object Prototype // mengatasi kekurangan object.create 
    // function Mahasiswa (nama, energy) {

    //     //dibelakang layar 
    //     /*
    //     let this = object.create(mahasiswa.prototype)
    //     return this.
    //     sehingga object yg ditranfer bukan dari 2 object yg berbeda ,tpi objek dari turunannya, atau object itu sendiri
    //      */
    //     this.nama = nama;
    //     this.energy = energy;
    //     //jadi bisa begini
    //     Mahasiswa.prototype.makan = function (porsi) {
    //         this.energy += porsi;

    //     }
    // }

    // let alex = new Mahasiswa("alex",16);

    //ini versi kelas ( sama saja ) dengan object prototype

    // class Mahasiswa {
    //     constructor (nama , energy) { // ini parameternya klo di class disebut constructor
    //         this.nama = nama;
    //         this.energy = energy;
    //     }

    //     makan (porsi) {
    //         this.energy += porsi;
    //     }
    // }

    // let deden = new Mahasiswa("deden" ,13);


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

 //Closure ( Execution context, hoisting , scope)

    // function  init() {
    //     // let nama = "Marianto";
    //     function tampil (nama) {
    //         console.log(nama);
    //     }
    //     return tampil;
    // }
    // // // jadi dalam fungsi init ada fungsi tampil, saat kita jalankan fungsi init, itu tampil ga dijalankan ,tpi fungsinya minta return tampil , nah artinya fungsinya baru dijalankan secara penuh, jadi kita harus taruh divariable lain , 

    // let panggilNama =  init(); // kita ga bisa init(nama); karna fungsi ini tidak menerima parameter, jadi kita harus akalin pake variable untuk akses/panggil fungsi di dalam init, kita taruh di variabel panggilNama ,
    // panggilNama("Andy"); // Variable panggilNama ini kita bisa langgsung anggap sebagai funggsi karna kita buat (panggilNama = fungsi init();)
    // panggilNama("Alex");
    // panggilNama("Ebdin");

    // // jadi begitu

// // Contoh Lain

    // function ucapkanSalam (waktu) {
    //     return function (nama) {
    //         console.log(` Halo ${nama} , Selamat ${waktu} `);
    //     }
    // }

    // let selamatPagi = ucapkanSalam('Pagi');
    // let selamatSiang = ucapkanSalam('Siang');
    // let selamatMalam = ucapkanSalam('Malam');

    //     selamatPagi("Marianto");
    //     selamatSiang("alex");



// Arrow Function 

    // const tampilNama = (nama) => {return `Halo, ${nama}`};

    // console.log(tampilNama("ebidin"));

    //lebih singkat

    // const tampilNama = nama =>`Halo, ${nama}`; //kurung bisa dihapus klo 1 parameter dan bisa hapus kurung kurawal;

    // console.log(tampilNama("ebidin"));


    //contoh kasus

//Map. Filter , and 


//Cara Biasa
    // const angka = [1,2,3,4,5,6,7,8,];
    // const newAngka = [];
    // for( let i = 0; i < angka.length; i++) {
    //     if( angka[i] >= 3) {
    //         newAngka.push(angka[i]);
    //     }
    // }
    // console.log(newAngka);

    // const angka = [1,2,3,4,5,6,7,8,];
    // const newAngka = angka.filter(function (e) {
    //     return e >= 3;     
    // });

    //BISA VERSI SIGKAT LAGI PAKE PEMAHAMAN ARROW
    
//ini Filter
    // const angka = [1,2,3,4,5,6,7,8,];
    // const newAngka = angka.filter (e => e >= 3 );
/*
    buat array baru newAngka diambil elemnnya dari angka tpi difilter lalu dengan function kita cari paramter (e) kita anggap setiap 1 elemenya yng lebih besar dari 3 kita amil
*/
    //  console.log(newAngka);
    

// Map // dengan map kita bisa manipulasi data yang kita dapatkan


    // const angka = [1,2,3,4,5,6,7,8,];
    // const newAngka = angka.map (e => e * 3 ); //dipetakan lala dikakalikan sebelum masuk ke array 
    // console.log(newAngka);


//reduce

    //jumlahkan seluruh angka
    // const angka = [1,2,3,4,5,6,7,8,];
    // const newAngka = angka.reduce((accumulator,currentvalue) => accumulator + currentvalue, 0);
    // console.log(newAngka);

//Methode Chaining // cari angka > 5, kalikan 2, lalu jumlahkan
    // const angka = [1,2,3,4,5,6,7,8,];
    // const newAngka = angka.filter(e => e > 5).map(e => e * 2).reduce((accumulator,currentvalue) => accumulator + currentvalue, 0);
    // console.log(newAngka);

//hasilnya diubah terus dalam 1 kali eksekusi;



// // Descrutering Assingment 

//     const angka = [1,2,3,4,5];

//     const [satu, dua ,tiga, ,lima] = angka;

//     console.log(satu);
//     console.log(dua);
//     console.log(tiga);
//     console.log(lima);


// //contoh kefungsi
//     function coba() {
//         return [1,2];
//     }

//     const [a ,b] = coba();
//     console.log(a);
//     console.log(b);


//resp parameter 

//ke object 

// const object = {
//     nama : 'Marianto',
//     umur : 20
// };

// const {nama , umur } = object;
// console.log(nama);

//yang diatas bisa disingkat lagi

    // ({nama , umur} = {
    //     nama : 'Marianto',
    //     umur : 20
    // });
    // console.log(nama);



//Descructering Funtion 

    // function perjumlahanPerkalian(a,b) {
    //     return [a + b, a * b];
    // };

    // // const jumlah = perjumlahanPerkalian(2,3)[0];
    // // const kali = perjumlahanPerkalian(2,3)[1];

    // // console.log(jumlah);
    // // console.log(kali);

    // //daripada Cara diatas kita bisa pakai cara desturtering funtion

    // const [jumlah, kali] = perjumlahanPerkalian(2,3);
    // console.log(jumlah);
    // console.log(kali);


//Destructering Object function

    // const mhs1 = {
    //     nama : "Marianto",
    //     umur : "20",
    //     emai : "Marianto0017@gmail.com"
    // };


    // function cetakMahasiswa({nama , umur}) { // disini pake dipecah object , karna pake kurung kurawal
        // //seperti yg begini
        // // const object = {
        // //     nama : 'Marianto',
        // //     umur : 20
        // // };

        // // const {nama , umur } = object;
    //     return `Halo nama saya ${nama}, saya berumur ${umur}`;
    // }


    // console.log(cetakMahasiswa(mhs1));



// For of dan For in (Looping baru);

    // const nama = ["Marianto" , "ebidin", "atan"];

    // //pake cara for

    // for(let i = 0; i < nama.length; i++) {
    //     console.log(nama[i]);
    // }
    //Pake Cara Foreach
    // nama.forEach((element, index) => console.log(element,index));

    // //Pake For Of  
    // for (const element of nama) {
    //     console.log(element);
    // }


//     function jumlahkanAngka() {
//         let jumlah = 0;
//         for(const argument of arguments) {
//             jumlah += argument;
//         }

//         return jumlah;
        
//     }

//     console.log(jumlahkanAngka(1,2,3,4,5)); // karna di fungsi ga ad parameter tapi kita paksa masukan argument saat panggil fungsi maka kita bisa pakai fasilitas arguments

    
// //FOR IN    
//     const msh = {
//         nama : 'Marianto',
//         umur : 20,
//     }
//     // ini hanya mendapatkan propertynya guys ya
    
//     for(index in msh) {
//         console.log(index);
//     }

//     // tapi masih bisa dapat value nya 

//     for(index in msh) {
//         console.log(msh[index]);
//     }



//Spread Operator 

    // const nama = ["ebidin", "asep" , "bukit"];

    // console.log(nama);
    // console.log(...nama); // ini tiap element
    // console.log(...nama[1]); // ini ke perkarater

    // // mengabungkan 2 array 

    // const array1 = ["satu" , "dua", "tiga"];
    // const array2 = ["empat" , "lima", "enam"];

    // const arrayGab = [...array1, ...array2];
    // const arrayGab0 = array1.concat(array2)
    // const arrayGab1 = [array1, array2]; // klo yang ini salah karna mengjadikan array multidimensi

    // console.log(arrayGab);
    // console.log(arrayGab1);
    // console.log(arrayGab0);


// cara mengcopy array yangbenar 

    // const array1 = ["satu" , "dua", "tiga"];
    // const arr = [...array1];
    // console.log(arr); // dengan ini kita bebas memanipulasi array arr ,tanpa khawatir merubah arrary1


//Callback


    function halo(nama) {
        alert(`Halo ${nama}`);
    }


    function tampilkanPesan(callback) {
        const nama = prompt("Masukan Nama :");
        callback(nama);
    }

    tampilkanPesan(halo);
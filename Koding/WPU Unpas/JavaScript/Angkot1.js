        // var angkot = 1;
        // while(angkot <= 10) {
        //     console.info("Angkat no " + angkot + " berjalan dengan baik");
        //     angkot++
        //     }

//perbaikan 
        // var jmlAngkot = 10;
        // var noAngkot = 1;
        // while(noAngkot <= jmlAngkot) {
        //     console.info("Angkat no " + noAngkot + " berjalan dengan baik");
        //     noAngkot++
        //     }



// syntac for
        // for(let i = 0; i <10; i++) {
        //     console.log("Hello World" + i + "kali");
        // }



// perbaikan 
        // var jmlAngkot = 10;
        // var noAngkot = 1;
        // var angkotBeroperasi = 6;
        // while(noAngkot <= angkotBeroperasi) {
        //     console.info("Angkat no " + noAngkot + " beroperasi dengan baik");
        //     noAngkot++
        // }
        
        // for(noAngkot = angkotBeroperasi + 1 ; noAngkot <= jmlAngkot ; noAngkot++) {
        //     console.info("Angkat no " + noAngkot + " sedang tidak beroperasi ");

        // }



//Percabangan if 
        // var jmlAngkot = 10;
        // var noAngkot = 1;
        // var angkotBeroperasi = 6;
        
        // for( var noAngkot = 1; noAngkot <= jmlAngkot; noAngkot++) {
        //     if(noAngkot <= angkotBeroperasi) {
        //     console.info("Angkat no " + noAngkot + " sedang  beroperasi ");
                
        //     } else {
        //     console.info("Angkat no " + noAngkot + " sedang tidak beroperasi ");

        //     }
        // }
        

//Percabangan else if 
        // var jmlAngkot = 10;
        // var noAngkot = 1;
        // var angkotBeroperasi = 6;
        
        // for( var noAngkot = 1; noAngkot <= jmlAngkot; noAngkot++) {
        //     if(noAngkot <= angkotBeroperasi && noAngkot !== 5) {
        //     console.info("Angkat no " + noAngkot + " sedang  beroperasi ");
                
        //     }  else if (noAngkot === 8 || noAngkot === 10 || noAngkot === 5)  {
        //         console.info("Angkat no " + noAngkot + " sedang lembur beroperasi ");

        //     }
            
        //     else {
        //     console.info("Angkat no " + noAngkot + " sedang tidak beroperasi ");

        //     }
        // }


//switch 

        // var tebakAngka = prompt("masukan Angka??");


        // switch(tebakAngka) {
        //     case '1' :
        //         alert("anda memasukan angka 1");
        //         break;
        // }


//function

        // function tambah () {  // difungsi ga ada parameter ,tpi pas di panggil disii beberapa item ,dan item tersebut masuk ke array sistem yg bernanma arguments

        //     return arguments
        // }

        // console.log(tambah("ere", 121,434,121,"feerre"));  // ini emng ga mmasuk ke fungsi tpi masuk ke array argumenst milik sistem


        // function tambahAuto () {
        //     var hasil = 0;
        //     for(let i = 0; i < arguments.length ; i++) { 
        //         hasil += arguments[i]; //dilooping setiap hasil dari array 0 ke 1,2,3 dan seterusnya lalu diisi ke var hasil
        //     }

        //     return hasil;
        // }

        // var coba = tambahAuto(32,32,2,523,323); // otomatis menjumhlahkan argumen yang bebas berapa saja dengan fungsi diatas
        // console.log(coba);

// Rekursif 

//cara biasa dari for 

        // for(let i = 10; i >= 0; i--) {
        //     console.log(i);
        // }

// cara kedua pake rekursif

        // function rekursif (n) {
        //     if(n === 0) {
        //         return;
        //     }
            
        //     console.log(n);
        //     return rekursif(n-1); // di fungsinya sendiri, kita return fungsi itu sendiri tapi dikurang 1 dan kita kasih basecase(if) biar ada batas 
        // }

        // console.log(rekursif(10)); //ini lah fungsi rekursif

// fungsi rekursif biasa nya dipake di faktorial

        // function factorial (data) {
        //     if(data === 1) {
        //         return 1
        //     }
        //     return data * factorial(data - 1); // belakang layar = 5*4*3*2*1;
        // }

        // console.log(factorial(5));



// function deklaration dan function expresstion 

        // //ini function deklaration 
        // namaFun(); // kelebihan function deklaration adalah kita bisa panggil dulu baru buat fungsinya ,jadi ga error karna ada sesuatu yang dinamakan hoisting, tapi klo yang function expresion ga bisa seperti ini


        // function nameFun () {

        // }

        // // ini function expresion // function expresion memiliki closure // argumen di function lain 
 
        // var namaFun = function () {

        // }

//arrray 

        // var binatang = [];
        // binatang = ["panda", "kucing"];

        // console.log(binatang[1]);
        // console.info(typeof(binatang));
        // console.log(binatang.length);

//lanjut manipulasi array

 //menambah array 

        // var arr = [];

        // arr[0] = "in satu";
        // arr[2] = "ini dua"; // cara ini harus hati hati karna data arr[1], juga ada cmn undifinedm jadi ga sesuai keadaan

        // //harus hapal index array juga kalo manual seperti diatas

// //menghapus 

        // arr[0] = undefined; // ini juga ssamam harus hapal index array dan cuman di kosongkan saja , padahal jumlah arrat tetap sama

        

// menampilkan isi array dengan looping

        // var arrg = ["satu", "dua", "tiga", "empat", "lima"];


        // for(let i = 0; i < arrg.length; i++)

        // {
        //         console.log(arrg[i]);
        // }


//MEthode array

//join

//         var arrg = ["satu", "dua", "tiga", "empat", "lima"];
//         console.log(arrg.join('-')); // mengabung data array kedalam 1 string dengan separator yang optional

// //push, pop ,shitf dan unshift

// // push menambahkan element baru di akhir array
//         arrg.push("dody");
//         console.log(arrg);
//         //push menghapus element terahkir array
//         arrg.pop();
//         console.log(arrg);
        
// //unshift 
// //unshift menambahkan element baru di awal array
//         arrg.unshift("doody" ,"ahmad"); //bisa 2 sekaligus
//         console.log(arrg);
//         //shift menghapus element baru diakhir array
//         arrg.shift();
//         console.log(arrg);
        
// //sekarang yang menambahkan di tengan tengah
// //slice dan splice
        
// //splice menyambung 
// //spice(indexAwal, maudDiHapusBerapa, elementBaru1, elementBaru2)
        
//         arrg.splice(4,0,"doddy lagi"); 
//         console.log(arrg);
//         arrg.splice(1,4,"doddy lagi"); //mulai dari index 1 dihapus 5 dan diganti element baru
//         console.log(arrg);
        
//  //slice 
//         //      
//         var arr2 = arrg.slice(1-3); //menghapus di tengah sesuai pilihan
//         console.log(arr2);



//foreach
//for biasa
        // var angka = [1,2,3,4,5,6,7,8,];
//       for(let i = 0; i < angka.length; i++)

//         {
//                 console.log(angka[i]);
//         }

// yang sekarang foreach 
// logikanya setiap array angka kita loping pake forEach dan setiap elemenya kita kasih fungsi yang menampilkan dirinya sendiri;
        // angka.forEach(function(e) { 
        //         console.log(e);
        // }
        // ); 

        //bisa juga funciont expresionya kita pisah 

//         var cetak = function (e) {
//                 console.log(e);
//         }

//         angka.forEach(cetak);

//         var arrg = ["satu", "dua", "tiga", "empat", "lima"];
// //bisa juga langsung mencetak value dan indexnya sekaligus dalam sebuah array
//         arrg.forEach(function(e,i) {
//                 console.log("ini valuenya   " + e + "ini indexnya " + i);
//         }) 


//map 

//bedanya map adalah dia bisa pake return klo for each ga bisa 



        // var angka = [1,2,3,4,5,6,7,8,];

        // var angka2 = angka.map(function(e){
        //         return e * 2;
        // });


        // console.log(angka2);

        // // ada juga sort karna terlalu gampang jadi ga gw tulis hehehe << sombong amat



// Filter <mengembalikan banyak nilai > \\ Find <mengembalikan satu nilai>
        // var number = [3,6,2,1,61,7,1,82,81,2,3,72,7,2,];
        // var digit = number.filter(function(e){
        //         return e > 5;
        // });

        //cara bacanya number di kita loping setiap elementnya,(number.funcition, lalu sebelum funciion kita sisipkan filter biar bisa return e > 5) 
        //maka akan dibuatkan array baru yg lebih besar dari 5

        // console.log(digit);
        
        // var number = [3,6,2,1,61,7,1,82,81,2,3,72,7,2,];
        // var digit = number.find(function(e){
        //         return e > 5; // find hanya menghasilakan 1 nilai dan data mengambil data pertama yang ditemukan nya yaitu 6
        // });

        
        // console.log(digit);



//object

        // var mahasiswa = {
        //         nama : "Marianto",
        //         umur : 20,
        //         ips : [21,3,21],
        //         alamat : {
        //                 jalan : "Jl.satria",
        //                 kota : "singkawang",
        //                 provinsi : "Kalbar"
        //         }
        // }

        // // cara akses 

        // console.log(mahasiswa.nama);
        // console.log(mahasiswa["nama"]);
        // //cara akses object dari object 

        // console.log(mahasiswa.alamat.jalan);


// cara membuat object ada 4 cara

//object literal, function declaration, constructor function dan object.creat



// object literal //ribet karna harus buat 1 1 

//         var msh1 = {
//                 nama : "udin",
//                 kelas : 12
//         }

//         var msh2 = {
//                 nama : "udin",
//                 kelas : 12
//         }

// //function deklariation 

//         function buatObjectMhs (nama, kelas) {
//                 var mhs = {};
//                 mhs.nama = nama;
//                 mhs.kelas = kelas;

//                 return mhs;
//         }  

//         //nah klo cara buatnya 

//         var mhs3 = buatObjectMhs( "alex" ,12);
//         console.log(mhs3);

//         // dans seterusnya var msh4


// // Constructor function  //kurang lebih mirip ,cumna konsturctor dikhususkan untuk membuat object

//         function Mahasiswa (nama, kelas) {
//                 this.nama = nama;
//                 this.kelas = kelas;
//         }
        
//         var mhs5 = new Mahasiswa("ebidin", 12); 

//         //bedanya ada di saat pembuatan dan pemanggilan //kita gaperlu bikin (object mhs) dan ga perlu return.

//         //pas panggil kita pake (new Mahasiswa (lalu elemernnya))



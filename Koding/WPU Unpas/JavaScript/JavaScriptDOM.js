    //nodelist dan hmtlcolection

    /*
    perent node 
    grandparent node 
    childenode h1 childe dari body
    sibling 
    descendend

    */

// DOm Selecetion
    // document.getElementById //elemet 
    // document.getElementsByTagName //HTMLCOlletion
    // document.getElementsByClassName //HTML Collection
    // document.querySelectorAll // Nodelist
    // document.querySelector //element
    
//     const judul = document.getElementById('h1'); //menangkap id h1 di html

//     judul.style.color = 'red'; //ditangkap lalu dimanipulasi
//     judul.style.backgroundColor = 'yellow';
//     judul.innerHTML = 'yellow';

//     const pargraf = document.getElementsByTagName('p');
//     pargraf['1'].style.color = 'blue'; // karna banyak 2 p yg ditembak jadi harus dipilih array indexnya , klo mau semua pake for

// // dan selector seterusnya 

//     const list = document.querySelectorAll('ul li'); // seperti syntac targeting di css
//     list[1].style.color = "red";
//     list[2].style.color = "green";


// DOM Manipulation 

//        const judul = document.getElementById('h1'); //menangkap id h1 di html
// //kira kira begini methode manipulastinya 
//     judul.innerHTML
//     judul.style.<property>
//     judul.setAttribute
//     judul.classList


    //    const judul = document.getElementById('h1'); //
    //    judul.setAttribute('name', 'marianto');
    //    judul.setAttribute('class' , 'kelasBaru'); //menambahkan attribut kelas bisa juga menimpa yg lama
    //    //untuk atribut kelass ada methode khusus
    
    //    judul.classList.add('fdd');
    //    judul.classList.remove('kelasBaru');
    //    judul.classList.replace('fdd', 'item') 
    //    judul.classList.toggle('halo'); 
    //    judul.classList.item(1) // mencari nama kelas sesuai index
    //    judul.classList.contains('halo') //mengecek apakah kelas halo ada di judul.
    
    
    
    
    // DOcument Manipulation Node
    
    // document.createElement
    // document.createTextNode
    // node.appendChild()
    //node.insertBefore()
    //parentNode.removeChild()
    //parentNode.replaceChidl();
    
    
    
//membuat element baru ke html 
    // const H2Element = document.createElement('h2'); //ini buat element
    
    // const H2Text = document.createTextNode('Ini H2 Baru'); // ini buat text 
    
    // H2Element.appendChild(H2Text); // ini digabungkan >> 
    
    //    const judul = document.getElementById('h1');

        // judul.appendChild(H2Element); // klo yang ini masuk ke tag h1
        // document.body.insertBefore(H2Element, judul); //harus tangkap parent dan di tulis di sisipkan sebelum judul
    


// Event 

//Event Handler addEventListener();


//event handler >> tangkap dulu ,buat fungsi terus ubah di file html (onclick.ubahWarna) 

//        const judul = document.getElementById('h1');
//        function ubahWarna () {
//            judul.style.backgroundColor = 'lightblue';
//        }

// //methode addeventlistener

    //    const div = document.getElementById('div');

    //    div.addEventListener('click', function() {
    //         const ul = document.querySelector('ul');
    //         const li = document.querySelector('li');
    //         const textli = document.createTextNode('list Baru');

    //         li.appendChild(textli);
    //         ul.nextSibling(li);
    //    });


// lebih direkomndasikan event 


//DOM Traversal








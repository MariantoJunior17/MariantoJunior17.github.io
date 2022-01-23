#Program Management Kontak (Modular)

#List Of Dictionary

from this import d
import function


daftar_kontak = []
daftar_kontak.append({
    "nama" : "Eko",
    "email" : "Marianto0017@gmail.com",
    "telepon" : "0895700615006"
})

#Menu Program
while True:
    print("# Menu")
    print("1. Daftar Kontak")
    print("2. Tambah Kotak")
    print("3. Hapus Kontak")
    print("4. Cari Kontak")
    print("0. Keluar Program")

    menu = input("Pilih Menu : ")

    if menu == "0":
        break
    elif menu =="1":
        function.display_kontak(daftar_kontak)
    elif menu =="2":
        kontak = function.new_kontak()
        daftar_kontak.append(kontak)
    elif menu == "3":
        function.del_kontak(daftar_kontak)
    elif menu == "4":
        function.cari_kontak(daftar_kontak)
    else:
        print("MENU TIDAK TERSEDIA")

print("Program Selesai Berjalan, Sampai Jumpa")
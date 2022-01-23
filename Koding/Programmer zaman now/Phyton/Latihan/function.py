

from operator import index


def display_kontak (daftar_kontak):
    for kontak in daftar_kontak:
        print("<<<=======>>>")
        print(f"Nama : {kontak['nama']}")
        print(f"Email : {kontak['email']}")
        print(f"Telepon : {kontak['telepon']}")

def new_kontak ():
    nama = input("nama :")
    email = input("email :")
    telepon = input("telepon :")

    kontak = {
        "nama" : nama,
        "email" : email,
        "telepon" : telepon
    }
    return kontak


def del_kontak (daftar_kontak):
    nama = input("Masukan nama kontak yang ingin dihapus : ")
    index = -1
    
    for i in range(0, len(daftar_kontak)):
        kontak = daftar_kontak[i]
        if nama == kontak["nama"]:
            index = i
            break

    if index == -1:
        print("Data tidak ditemukan")
    else:
        del daftar_kontak[index]
        print("Data berhasil dihapus")


def cari_kontak (daftar_kontak):
    nama_yg_dicari = input("Masukan nama yang ingin dicari :")

    for kontak in daftar_kontak:
        nama = kontak["nama"]
        if nama.lower().find(nama_yg_dicari.lower()) != -1:
            print("<<<=======>>>")
            print(f"Nama : {kontak['nama']}")
            print(f"Email : {kontak['email']}")
            print(f"Telepon : {kontak['telepon']}")

   

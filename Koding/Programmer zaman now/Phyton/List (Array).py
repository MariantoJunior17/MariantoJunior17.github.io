#menambahkan list (array)

nama = ["eko", "alex"]
nama.append("joko") #bisa juga begini

print(nama)

#mengakses data nama
print(nama[1]) # pake index 

#Cek jumlah data list

print(len(nama))# pake perintah len

#Menghapus Data List

nama.remove("eko") #menghapus Eko
print(nama) # posisi index bisa berubah


#Mengubah Data List
nama[0] = "alex ganteng" 
print(nama)
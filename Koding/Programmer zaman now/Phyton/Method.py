#Methode /Fungsi > menghilangkan kerumitan kode, atau kode berulang

# nama = []

# nama.append("eko")
# print("<><><>><><>") ## ini tidak efektif karna banyak pengulangan kode
# for n in nama:
#     print(n)

# nama.append("ebidin")
# print("<><><>><><>")
# for n in nama:
#     print(n)

# nama.append("alex")
# print("<><><>><><>")
# for n in nama:
#     print(n)



#>>>>>>>>>>>.PERBAIKAN>>>>>>>>>>>>>>>>>>>>.

#buat methode 
# nama = []

# def print_nama(): # yang berualang kita masukan kedalam methode // ini cara buat methode
#     print("<><><>><><>")
#     for n in nama:
#         print(n)

# nama.append("alex") #// lebih singkat dari yang diatas
# print_nama() # lalu kita panggil seperti ini

# nama.append("doddy")
# print_nama()


#>>>>>>>>>>>>> Methode Paramter >>>>>>>>>>>>>>>>>>>>>>>>>>>
# def say_Hello (nama): # ini paramter bisa juga lebih dari 2
#     print(f" Hallo {nama}")


# say_Hello("eko") # ini argument data "Eko " akan ditranfer ke parameter fungsi say_Hello
# say_Hello("ebidin")

#>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Default Methode Parrameter

# def say_Hello (nama, umur = 23): #defalult value parameter klo di panggil
#     print(f" Hallo {nama} {umur}")


# say_Hello("eko") 
# say_Hello("ebidin", 43) # dia akan mencari input pasti parameternya dulu baru default paramenternya




# if

# if(6 > 5): print("benar")


#>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
#IF statementnya seperti excel kurang lebih
# orang = 100
# zombie = 100

# if orang > zombie: 
#     print("Manusia menang")

# if orang < zombie: 
#     print("Manusia Kalah")

# if orang == zombie: 
#     print("Setara")

#>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

menang = True # ada juga fitur elsenya
if menang:
    print("menang")
else:
    print("kalah")


#>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
#else if

menu_Pilihan = input("silahkan pilih menu [1-3]")
if menu_Pilihan == "1":
    print("memilih menu 1")
elif menu_Pilihan == "2":  #pake elif (else if)
    print("memilih menu 2")
elif menu_Pilihan == "3":
    print("memilih menu 3")
else:
    print("anda tidak memilih menu")



def jumlahkan(*list_angka):
        total = 0
        for angka in list_angka:
            total += angka
        print(total)
        return total

total = jumlahkan(323,32,32,32,23,)

print(total)
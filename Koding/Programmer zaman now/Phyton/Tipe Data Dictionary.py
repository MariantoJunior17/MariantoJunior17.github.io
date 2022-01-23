# tipe data dictionary mirip set (mirip juga object karna ini pakai key dan value)

from multiprocessing.sharedctypes import Value


customer = {"nama": "Marianto", "age": "20"}

print(customer["nama"])

age = customer["age"]

print(age)

for key in customer:
    value = customer[key]
    print(f"{key} : {value}")

#menambahkan data baru 
customer["company"] = "XYZ"

# cara menghapus key dan value
del customer["nama"]
arr = "LEBROS"[:]

tar = input()

if tar in arr:
    print(arr.index(tar))
else:
    print("None")
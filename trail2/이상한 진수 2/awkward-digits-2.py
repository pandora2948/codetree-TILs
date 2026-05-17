a = list(input())

# Please write your code here.

res = 0
for i in range(len(a)):
    b = a[:]
    if b[i] == "0":
        b[i] = "1"
    else:
        b[i] = "0"
    n = int("".join(b), 2)
    res = max(res, n)

print(res)
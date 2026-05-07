a, b, c = map(int, input().split())

if a > b and a > c:
    print(b if b > c else c)
elif b > a and b > c:
    print(a if a > c else c)
else :
    print(a if a > b else b)
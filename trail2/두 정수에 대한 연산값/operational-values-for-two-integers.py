a, b = map(int, input().split())

# Please write your code here.

def func(n, m):
    n += 25
    m *= 2
    return n, m

    

if a > b:
    a, b = func(a, b)
else:
    b, a = func(b, a)

print(f'{a} {b}')
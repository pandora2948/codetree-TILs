N, B = map(int, input().split())

# Please write your code here.

def func(num):
    if num < B:
        return str(num)
    
    return func(num // B) + str(num % B)

print(func(N))
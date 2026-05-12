n = int(input())

# Please write your code here.

def func(num):
    if num <= 1:
        return str(num)
    
    return func(num // 2) + str(num % 2)

print(func(n))

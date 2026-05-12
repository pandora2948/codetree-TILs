N = list(reversed(input()))

# Please write your code here.

def func(num):
    if num < 2:
        return str(num)
    
    return func(num // 2) + str(num % 2)

num = 0
for i in range(len(N)):
    if N[i] == "1":
        num += 2 ** i

num *= 17

res = func(num)
print(res)
a, b = map(int, input().split())
n = list(reversed(input()))

# Please write your code here.
def func(num):
    if num < b:
        return str(num)
    return func(num // b) + str(num % b)

num = 0

for i in range(len(n)):
    num += a ** i * int(n[i])

print(func(num))
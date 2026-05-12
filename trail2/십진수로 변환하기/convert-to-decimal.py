binary = list(reversed(input()))

# Please write your code here.

num = 0
for i in range(len(binary)):
    if binary[i] == "1":
        num += 2 ** i

print(num)
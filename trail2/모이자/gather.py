n = int(input())
A = list(map(int, input().split()))

# Please write your code here.

res = 10000000
for i in range(n):
    total = 0
    for j in range(n):
        total += A[j] * abs(i - j)
    res = min(res, total)
print(res)
n = int(input())
a = [int(input()) for _ in range(n)]

# Please write your code here.

res = 100000000000

for i in range(n):
    total_dist = 0
    for j in range(n):
        total_dist += a[(i + j + n - 1) % n] * j
    res = min(res, total_dist)
print(res)
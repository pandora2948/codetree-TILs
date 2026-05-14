N, M, K = map(int, input().split())
student = [int(input()) for _ in range(M)]

# Please write your code here.
std = [0 for _ in range(N + 1)]
res = -1

for s in student:
    std[s] += 1
    if std[s] >= K:
        res = s
        break

print(res)
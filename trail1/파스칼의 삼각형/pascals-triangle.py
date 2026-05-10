n = int(input())

tbl = [[0 for _ in range(n)] for _ in range(n)]

for i in range(n):
    for j in range(i + 1):
        tbl[i][j] = 1

for i in range(1, n):
    for j in range(1, n):
        tbl[i][j] = tbl[i - 1][j - 1] + tbl[i - 1][j]

for i in range(n):
    for j in range(i + 1):
        print(tbl[i][j], end=" ")
    print()
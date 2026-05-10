n = int(input())

tbl = [[1 for _ in range(n)] for _ in range(n)]

for i in range(1, n):
    for j in range(1, n):
        tbl[i][j] = tbl[i - 1][j] + tbl[i][j - 1] + tbl[i - 1][j - 1]

for items in tbl:
    for el in items:
        print(el, end=" ")
    print()

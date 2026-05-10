tbl = [[1 for _ in range(5)] for _ in range(5)]

for i in range(1, 5):
    for j in range(1, 5):
        tbl[i][j] = tbl[i - 1][j] + tbl[i][j - 1]

for items in tbl:
    for el in items:
        print(el, end=" ")
    print()
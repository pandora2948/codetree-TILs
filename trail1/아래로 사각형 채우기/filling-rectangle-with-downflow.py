n = int(input())

tbl = [[0 for _ in range(n)] for _ in range(n)]

cnt = 1
for i in range(n):
    for j in range(n):
        tbl[j][i] = cnt
        cnt += 1

for items in tbl:
    for el in items:
        print(el, end=" ")
    print()

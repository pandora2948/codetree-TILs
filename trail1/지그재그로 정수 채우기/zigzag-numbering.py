n, m = map(int, input().split())

tbl = [[0 for _ in range(m)] for _ in range(n)]

cnt = 0
for col in range(m):
    if col % 2 == 0:
        for row in range(n):
            tbl[row][col] = cnt
            cnt += 1
    else:
        for row in reversed(range(n)):
            tbl[row][col] = cnt
            cnt += 1
    

for items in tbl:
    for el in items:
        print(el, end=" ")
    print()
            
n, m = map(int, input().split())

tbl = [[0 for _ in range(n)] for _ in range(n)]

for _ in range(m):
    r, c = map(int, input().split())

    tbl[r - 1][c - 1] = r * c

for items in tbl:
    for el in items:
        print(el, end=" ")
    print()
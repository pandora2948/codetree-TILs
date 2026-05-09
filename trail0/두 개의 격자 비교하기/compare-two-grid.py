import sys

input = sys.stdin.readline
print = sys.stdout.write

n, m = map(int, input().strip().split())

tbl = [[list(map(int, input().strip().split()))for _ in range(n)] for _ in range(2)]

for i in range(n):    
    for j in range(m):
        print(str(1 if tbl[0][i][j] != tbl[1][i][j] else 0) + " ")
    print("\n")

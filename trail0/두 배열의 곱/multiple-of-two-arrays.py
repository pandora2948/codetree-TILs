import sys

input = sys.stdin.readline
print = sys.stdout.write

tbl = [[], []]

for i in range(3):
    tbl[0].append(list(map(int, input().strip().split())))

input()

for i in range(3):
    tbl[1].append(list(map(int, input().strip().split())))

for i in range(3):
    for j in range(3):
        print("%d " %(tbl[0][i][j] * tbl[1][i][j]))
    print("\n")
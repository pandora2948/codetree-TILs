import sys

input = sys.stdin.readline
print = sys.stdout.write

li = [list(map(int, input().strip().split())) for _ in range(4)]

cnt = 0

for i in range(4):
    for j in range(i + 1):
        cnt += li[i][j]

print(str(cnt))
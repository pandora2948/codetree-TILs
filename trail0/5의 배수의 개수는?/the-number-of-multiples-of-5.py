import sys

input = sys.stdin.readline
print = sys.stdout.write

cnt = 0

for _ in range(4):
    li = list(filter(lambda x: x % 5 == 0, map(int, input().strip().split())))
    cnt += len(li)

print(str(cnt))
import sys

input = sys.stdin.readline
print = sys.stdout.write

s, e = map(int, input().strip().split())

res = 0

for i in range(s, e + 1):
    cnt = 0
    
    for j in range(1, i + 1):
        if i % j == 0:
            cnt += 1
    if cnt == 3:
        res += 1

print(str(res))
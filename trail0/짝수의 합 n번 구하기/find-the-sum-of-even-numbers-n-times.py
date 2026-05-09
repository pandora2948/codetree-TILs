import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

for _ in range(n):
    a, b = map(int, input().strip().split())
    cnt = 0

    for i in range(a, b + 1):
        if i % 2 == 0:
            cnt += i
    
    print(str(cnt) + "\n")
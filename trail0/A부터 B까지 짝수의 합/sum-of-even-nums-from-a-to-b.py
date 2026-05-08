import sys

input = sys.stdin.readline
print = sys.stdout.write

a, b = map(int, input().strip().split())

total = 0
for i in range(a, b + 1):
    if i % 2 == 0:
        total += i

print(str(total))
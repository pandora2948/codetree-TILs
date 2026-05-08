import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())


acc = 0
for i in range(1, 101):
    acc += i
    if acc >= n:
        print(str(i))
        break


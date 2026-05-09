import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

for i in range(n):
    if i % 2 != 0:
        for j in range(n, 0, -1):
            print(str(j))
    else:
        for j in range(1, n + 1):
            print(str(j))
    print('\n')

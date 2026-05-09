import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

for i in range(n):
    for j in range(n):
        if j % 2 == 0:
            print(str(i + 1))
        else:
            print(str(n - i))
    print('\n')
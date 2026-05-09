import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

cnt = 1

for i in range(1, n + 1):
    for j in range(i):
        print(str(cnt) + " ")
        cnt += 1
    print("\n")
import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

for i in range(1, n + 1):
    for j in range(1, n + 1):
        print("%d * %d = %d" %(i, j, i * j))
        if j != n:
            print(", ")
    print("\n")

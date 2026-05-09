import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

for i in range(n, 0, -1):
    for j in range(i):
        print("* ")
    for j in range(n - i):
        print(" ")
    print("\n")
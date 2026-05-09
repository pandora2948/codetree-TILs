import sys

input = sys.stdin.readline
print = sys.stdout.write

n, m = map(int, input().strip().split())

for _ in range(n):
    for _ in range(m):
        print("* ")
    print("\n")
import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

for i in range(n):
    print("*")
    for j in range(i):
        print("**")
    print("\n")
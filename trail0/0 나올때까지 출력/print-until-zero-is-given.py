import sys

input = sys.stdin.readline
print = sys.stdout.write

while True:
    n = int(input())
    if n == 0:
        break
    print(str(n) + "\n")
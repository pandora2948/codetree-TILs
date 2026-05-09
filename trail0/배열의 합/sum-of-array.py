import sys

input = sys.stdin.readline
print = sys.stdout.write

for _ in range(4):
    li = list(map(int, input().strip().split()))
    print(str(sum(li)) + "\n")
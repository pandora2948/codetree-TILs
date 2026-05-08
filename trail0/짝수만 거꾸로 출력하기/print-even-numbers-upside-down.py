import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

arr = []

for item in map(int, input().strip().split()):
    arr.append(item)

arr.reverse()

for item in arr:
    if item % 2 == 0:
        print(str(item) + " ")
import sys

input = sys.stdin.readline
print = sys.stdout.write



li = [map(lambda x: int(x) * 3, input().strip().split()) for _ in range(3)]

for row in li:
    for item in row:
        print(str(item) + " ")
    print("\n")
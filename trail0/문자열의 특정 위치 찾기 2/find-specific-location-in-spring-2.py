import sys

input = sys.stdin.readline
print = sys.stdout.write

strs = ["apple", "banana", "grape", "blueberry", "orange"]

tar = input().strip()

cnt = 0
for s in strs:
    if s[2] == tar or s[3] == tar:
        print(s + "\n")
        cnt += 1

print(str(cnt))
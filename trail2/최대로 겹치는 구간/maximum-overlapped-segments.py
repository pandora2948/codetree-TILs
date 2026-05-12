n = int(input())
segments = [tuple(map(int, input().split())) for _ in range(n)]

# Please write your code here.

OFFSET = 100
arr = [0 for _ in range(201)]

for a, b in segments:
    for i in range(a, b):
        arr[OFFSET + i] += 1

print(max(arr))
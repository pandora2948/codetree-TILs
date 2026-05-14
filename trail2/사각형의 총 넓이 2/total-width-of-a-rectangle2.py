n = int(input())
x1, y1, x2, y2 = [], [], [], []
for _ in range(n):
    a, b, c, d = map(int, input().split())
    x1.append(a)
    y1.append(b)
    x2.append(c)
    y2.append(d)

# Please write your code here.

OFFSET = 100

grid = [[0 for _ in range(OFFSET * 2 + 1)] for _ in range(OFFSET * 2 + 1)]

for a, b, c, d in zip(x1, y1, x2, y2):
    for row in range(a, c):
        for col in range(b, d):
            grid[row][col] = 1

res = sum(grid, [])

print(res.count(1))
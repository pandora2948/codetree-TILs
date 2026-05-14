x1 = [0] * 3
y1 = [0] * 3
x2 = [0] * 3
y2 = [0] * 3

x1[0], y1[0], x2[0], y2[0] = map(int, input().split())
x1[1], y1[1], x2[1], y2[1] = map(int, input().split())
x1[2], y1[2], x2[2], y2[2] = map(int, input().split())

# Please write your code here.
OFFSET = 1000
grid = [[0 for _ in range(OFFSET * 2 + 1)] for _ in range(OFFSET * 2 + 1)]

for a, b, c, d in list(zip(x1, y1, x2, y2))[:2]:
    for row in range(a, c):
        for col in range(b, d):
            grid[row][col] = 1

for row in range(x1[2], x2[2]):
    for col in range(y1[2], y2[2]):
        grid[row][col] = 0

res = sum(grid, [])

print(res.count(1))
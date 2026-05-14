n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]
x, y = zip(*points)
x, y = list(x), list(y)

# Please write your code here.
SIZE = 8
OFFSET = 100
grid = [[0 for _ in range(OFFSET * 2 + 1)] for _ in range(OFFSET * 2 + 1)]

for i in range(n):
    for row in range(x[i], x[i] + SIZE):
        for col in range(y[i], y[i] + SIZE):
            grid[row + OFFSET][col + OFFSET] = 1

res = sum(grid, [])
print(res.count(1))
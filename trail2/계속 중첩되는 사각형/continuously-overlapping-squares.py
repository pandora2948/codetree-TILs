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

for i in range(n):
    for row in range(x1[i], x2[i]):
        for col in range(y1[i], y2[i]):
            # 1 is red, 2 is blue
            grid[row + OFFSET][col + OFFSET] = 1 if i % 2 == 0 else 2

print(sum(grid, []).count(2))
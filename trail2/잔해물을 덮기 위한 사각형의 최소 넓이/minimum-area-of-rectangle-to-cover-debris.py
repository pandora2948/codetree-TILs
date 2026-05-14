x1, y1, x2, y2 = [0] * 2, [0] * 2, [0] * 2, [0] * 2
x1[0], y1[0], x2[0], y2[0] = map(int, input().split())
x1[1], y1[1], x2[1], y2[1] = map(int, input().split())

# Please write your code here.
OFFSET = 1000
grid = [[0 for _ in range(OFFSET * 2 + 1)] for _ in range(OFFSET * 2 + 1)]

for i in range(2):
    for row in range(x1[i], x2[i]):
        for col in range(y1[i], y2[i]):
            grid[row + OFFSET][col + OFFSET] = 1 if i == 0 else 0

min_row = 10000
min_col = 10000
max_row = 0
max_col = 0
for row in range(OFFSET * 2 + 1):
    for col in range(OFFSET * 2 + 1):
        if grid[row][col] == 1:
            min_row = min(min_row, row)
            max_row = max(max_row, row)
            min_col = min(min_col, col)
            max_col = max(max_col, col)

if max_col == 0 or max_row == 0:
    print(0)
else :
    print((max_col - min_col + 1) * (max_row - min_row + 1))
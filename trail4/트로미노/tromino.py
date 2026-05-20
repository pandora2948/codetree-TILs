n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
res = 0
def check_block_1(r, c):
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]
    total_max = 0
    for i in range(4):
        b1 = [r + dr[i], c + dc[i]]
        b2 = [r + dr[(i+1)%4], c + dc[(i+1)%4]]
        if 0 <= b1[0] < n and 0 <= b1[1] < m and 0 <= b2[0] < n and 0 <= b2[1] < m:
            blk_total = grid[r][c] + grid[b1[0]][b1[1]] + grid[b2[0]][b2[1]]
            total_max = max(total_max, blk_total)
    return total_max

def check_block_2(r, c):
    total_max = 0
    
    if r + 2 < n:
        total_max = max(total_max, grid[r][c]+grid[r+1][c]+grid[r+2][c])
    
    if c + 2 < m:
        total_max = max(total_max, grid[r][c]+grid[r][c+1]+grid[r][c+2])
    return total_max

for row in range(n):
    for col in range(m):
        blk1_res = check_block_1(row, col)
        blk2_res = check_block_2(row, col)
        res = max(res, blk1_res, blk2_res)

print(res)
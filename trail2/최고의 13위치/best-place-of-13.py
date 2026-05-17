n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
OFFSET = 3
res = 0
for i in range(n):
    for j in range(n - OFFSET + 1):
        cnt = 0
        for k in range(3):
            if grid[i][j + k] == 1:
                cnt += 1
        res = max(res, cnt)

print(res)
n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
def dig(row, col, radius):
    cost = (radius**2) + ((radius+1)**2)
    golds = 0
    for r in range(row-radius, row+radius+1):
        for c in range(col-radius, col+radius+1):
            if 0 <= r < n and 0 <= c < n:
                if abs(row-r) + abs(col-c) <= radius:
                    golds += grid[r][c]
    
    if golds * m >= cost:
        return golds
    return -1

res = 0
for row in range(n):
    for col in range(n):
        for radius in range(n*2):
            res = max(res, dig(row, col, radius))
print(res)
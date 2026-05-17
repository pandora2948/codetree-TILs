R, C = map(int, input().split())
grid = [list(input().split()) for _ in range(R)]

# Please write your code here.
res = 0
s, e = grid[0][0], grid[R - 1][C - 1]

for i in range(1, R):
    for j in range(1, C):
        nxt1 = grid[i][j]
        for k in range(i + 1, R - 1):
            for l in range(j + 1, C - 1):
                nxt2 = grid[k][l]
                if s != nxt1 and nxt1 != nxt2 and nxt2 != e:
                    res += 1

print(res)
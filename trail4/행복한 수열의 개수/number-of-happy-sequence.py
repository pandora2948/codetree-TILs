n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
res = 0
for row in range(n):
    a = grid[row]
    cnt = 0
    cnt_max = 0
    for i in range(n):
        if i == 0 or a[i-1] != a[i]:
            cnt = 1
        else:
            cnt += 1
        cnt_max = max(cnt_max, cnt)
    if cnt_max >= m:
        res += 1

for col in range(n):
    a = []
    for row in range(n):
        a.append(grid[row][col])
    cnt = 0
    cnt_max = 0
    for i in range(n):
        if i == 0 or a[i-1] != a[i]:
            cnt = 1
        else:
            cnt += 1
        cnt_max = max(cnt_max, cnt)
    if cnt_max >= m:
        res += 1

print(res)
        
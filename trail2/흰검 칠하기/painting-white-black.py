n = int(input())
commands = [tuple(input().split()) for _ in range(n)]
x = []
dir = []
for num, direction in commands:
    x.append(int(num))
    dir.append(direction)

# Please write your code here.
OFFSET = 100000
#black: 2, white: 1
cur_color = [0 for _ in range(OFFSET * 2 + 1)]
cnt_b = [0 for _ in range(OFFSET * 2 + 1)]
cnt_w = [0 for _ in range(OFFSET * 2 + 1)]
pos = OFFSET

for i in range(n):
    d = dir[i]
    l = x[i]
    
    if d == 'L':
        for j in range(pos - l + 1, pos + 1):
            cur_color[j] = 1
            cnt_w[j] += 1
        pos = pos - l + 1
    else:
        for j in range(pos, pos + l):
            cur_color[j] = 2
            cnt_b[j] += 1
        pos = pos + l - 1

res = [0 for _ in range(3)]
    
for i in range(len(cur_color)):
    if cur_color[i] == 0:
        continue

    if cnt_b[i] >= 2 and cnt_w[i] >= 2:
        res[2] += 1
    else:
        res[cur_color[i] - 1] += 1

print(*res)
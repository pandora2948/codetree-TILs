n, m = map(int, input().split())

d = []
t = []
for _ in range(n):
    direction, time = input().split()
    d.append(direction)
    t.append(int(time))

d2 = []
t2 = []
for _ in range(m):
    direction, time = input().split()
    d2.append(direction)
    t2.append(int(time))

# Please write your code here.
pos = [[],[]]
cur = 0
for i in range(n):
    for j in range(t[i]):
        if d[i] == 'L':
            cur -= 1
            pos[0].append(cur)
        else:
            cur += 1
            pos[0].append(cur)    

cur = 0
for i in range(m):
    for j in range(t2[i]):
        if d2[i] == 'L':
            cur -= 1
            pos[1].append(cur)
        else:
            cur += 1
            pos[1].append(cur)

res = 0
for i in range(1, max(len(pos[0]), len(pos[1]))):
    a, b = pos[0][i], pos[1][i]
    if a == b:
        res = i + 1
        break

print(res if res != 0 else -1)
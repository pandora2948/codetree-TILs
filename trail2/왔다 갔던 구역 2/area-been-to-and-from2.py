n = int(input())
x = []
dir = []
for _ in range(n):
    xi, di = input().split()
    x.append(int(xi))
    dir.append(di)

# Please write your code here.

OFFSET = 1000
arr = [0 for _ in range(2001)]
pos = 1000

for i in range(n):
    d = dir[i]
    l = x[i]

    if d == 'L':
        for j in range(pos - l, pos):
            arr[j] += 1
        pos -= l
    else:
        for j in range(pos, pos + l):
            arr[j] += 1
        pos += l

print(len(list(filter(lambda x: x >= 2, arr))))
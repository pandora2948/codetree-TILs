n = int(input())
commands = [tuple(input().split()) for _ in range(n)]
x = []
dir = []
for num, direction in commands:
    x.append(int(num))
    dir.append(direction)

# Please write your code here.
OFFSET = 100000
arr = [0 for _ in range(OFFSET * 2 + 1)]
pos = OFFSET

for i in range(n):
    d = dir[i]
    l = x[i]
    # L 일때, White(1)
    if d == "L":
        for j in range(pos - l + 1, pos + 1):
            arr[j] = 1
        pos = pos - l + 1
    # R 일때, Black(2)
    else:
        for j in range(pos, pos + l):
            arr[j] = 2
        pos = pos + l - 1
    
res = [arr.count(1), arr.count(2)]
print(*res)
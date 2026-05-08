import sys

input = sys.stdin.readline
print = sys.stdout.write

a, b = map(int, input().strip().split())

cnt = a
while True:
    if cnt > b:
        break
    
    print(str(cnt) + " ")
    if cnt % 2 != 0:
        cnt *= 2
    else:
        cnt += 3
    

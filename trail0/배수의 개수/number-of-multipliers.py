import sys

input = sys.stdin.readline
print = sys.stdout.write

t1, t2 = 0, 0

for _ in range(10):
    n = int(input())
    if n % 3 == 0:
        t1 +=1
    if n % 5 == 0:
        t2 += 1

print("%d %d" %(t1, t2))
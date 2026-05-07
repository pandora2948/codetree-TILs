a, b, c = map(int, input().split())

total = a + b + c
avg = total // 3

print(total, avg, total - avg, sep='\n')
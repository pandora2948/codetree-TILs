n = int(input())
arr = [int(input()) for _ in range(n)]

# Please write your code here.

max_len = 0
cur_len = 0

for i in range(n):
    if n == 0 or arr[i] > arr[i - 1]:
        cur_len += 1
        continue
    
    max_len = max(max_len, cur_len)
    cur_len = 1

max_len = max(max_len, cur_len)

print(max_len)
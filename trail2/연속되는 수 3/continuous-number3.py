N = int(input())
arr = [int(input()) for _ in range(N)]

# Please write your code here.

max_len = 0
cur_len = 0
cnt = 0

for i in range(N):
    if i == 0 or (arr[i] < 0 and arr[i - 1] < 0) or (arr[i] > 0 and arr[i - 1] > 0):
        cur_len += 1
        continue

    max_len = max(max_len, cur_len)
    cur_len = 1
    cnt += 1
    
max_len = max(max_len, cur_len)
print(max_len)
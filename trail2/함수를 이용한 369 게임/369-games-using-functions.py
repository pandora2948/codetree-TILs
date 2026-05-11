a, b = map(int, input().split())

# Please write your code here.
def func(num):
    s = str(num)
    if "3" in s or "6" in s or "9" in s or num % 3 == 0:
        return True
    return False

cnt = 0
for i in range(a, b + 1):
    cnt += 1 if func(i) else 0

print(cnt)
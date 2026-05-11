a, b = map(int, input().split())

# Please write your code here.
def func(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

cnt = sum(i for i in range(a, b + 1) if func(i))

print(cnt)

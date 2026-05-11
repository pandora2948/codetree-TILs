n = int(input())

# Please write your code here.
def func(num):
    total = 0
    if num % 2 == 0:
        total = sum(map(int, str(num)))
        if total > 0 and total % 5 == 0:
            return True
    return False

print("Yes" if func(n) else "No")
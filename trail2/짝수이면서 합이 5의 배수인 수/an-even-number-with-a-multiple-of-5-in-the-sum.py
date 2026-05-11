n = int(input())

# Please write your code here.
def func(num):
    total = 0
    if num % 2 == 0:
        while True:
            if num < 10:
                total += num
                break
            total += num % 10
            num //= 10
        if total > 0 and total % 5 == 0:
            return True
    return False

print("Yes" if func(n) else "No")
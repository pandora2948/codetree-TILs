y = int(input())

# Please write your code here.
def func(n):
    if n % 4 != 0:
        return False
    
    if n % 100 == 0 and n % 400 != 0:
        return False
    return True

print(str(func(y)).lower())
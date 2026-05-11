N = int(input())

# Please write your code here.
def func(num):
    if num <= 0:
        return 0
    
    return func(num - 2) + num

print(func((N)))

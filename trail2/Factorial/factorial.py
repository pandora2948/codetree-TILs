N = int(input())

# Please write your code here.
def facto(num):
    if num == 1:
        return 1
    
    return facto(num - 1) * num

print(facto(N))
N = int(input())

# Please write your code here.

def func(num):
    if num == 0:
        return
    
    print(num, end=" ")
    func(num - 1)
    print(num, end=" ")

func(N)
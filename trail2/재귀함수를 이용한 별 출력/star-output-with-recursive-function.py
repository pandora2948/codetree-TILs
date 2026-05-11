n = int(input())

# Please write your code here.

def func(num):
    if num == 0:
        return
    
    func(num - 1)
    print("*" * num)

func(n)
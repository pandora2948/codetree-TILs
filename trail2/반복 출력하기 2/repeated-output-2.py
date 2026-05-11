n = int(input())

# Please write your code here.

def func(n):
    if n == 0:
        return
    print("HelloWorld")
    func(n - 1)

func(n)
n = int(input())

# Please write your code here.

def func1(num):
    if num == 0:
        return
    
    func1(num - 1)
    print(num, end=" ")

def func2(num):
    if num == 0:
        return
    
    print(num, end=" ")
    func2(num - 1)

func1(n)
print()
func2(n)

K, N = map(int, input().split())

# Please write your code here.
a = []

def f(num):
    if num == N:
        print(*a)
        return
    
    for i in range(1, K+1):
        a.append(i)
        f(num+1)
        a.pop()

f(0)
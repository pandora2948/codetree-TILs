n = int(input())

res = ''

if n >= 3000 :
    res = 'book'
elif n >= 1000:
    res = 'mask'
else :
    res = 'no'

print(res)
n = int(input())

res = ''

if n >= 90:
    res = 'A'
elif n >= 80:
    res = 'B'
elif n >= 70:
    res = 'C'
elif n >= 60:
    res = 'D'
else :
    res = 'F'

print(res)
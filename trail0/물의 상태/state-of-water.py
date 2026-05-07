temp = int(input())

res = ''

if temp < 0:
    res = 'ice'
elif temp >= 100:
    res = 'vapor'
else : 
    res = 'water'

print(res)
s = list(input())

s[-2] = 'a'
s[1] = 'a'

print(''.join(s))
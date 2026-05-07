a = int(input())

is_pass = False

if a % 13 == 0 or a % 19 == 0 :
    is_pass = True

print(is_pass)
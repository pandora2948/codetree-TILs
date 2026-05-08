import sys

input = sys.stdin.readline
print = sys.stdout.write

while True:
    n = int(input())

    if n > 25:
        print("Lower\n")
        continue
    elif n < 25:
        print("Higher\n")
        continue
    
    print("Good")
    break
import sys

input = sys.stdin.readline;

n = int(input())



for i in range(n, 101):
    res = "F"
    if i >= 90:
        res = "A"
    elif i >= 80:
        res = "B"
    elif i >= 70:
        res = "C"
    elif i >= 60:
        res ="D"

    print(res, end=' ')


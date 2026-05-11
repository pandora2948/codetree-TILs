m1, d1, m2, d2 = map(int, input().split())

# Please write your code here.
days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

day1 = d1 + sum(days[i] for i in range(m1 - 1))
day2 = d2 + sum(days[i] for i in range(m2 - 1))

print(abs(day2 - day1) + 1 if day1 != day2 else 1)
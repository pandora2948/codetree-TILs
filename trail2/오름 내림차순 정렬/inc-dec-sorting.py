n = int(input())
nums = list(map(int, input().split()))

# Please write your code here.

sorted_nums = list(map(str, sorted(nums)))
reversed_nums = list(map(str, sorted(nums, reverse=True)))

print(" ".join(sorted_nums))
print(" ".join(reversed_nums))
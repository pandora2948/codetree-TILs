n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]

# Please write your code here.

def get_dist(p1, p2):
    return abs(p1[0] - p2[0]) + abs(p1[1] - p2[1])


total_dist = 0
for i in range(n - 1):
    total_dist += get_dist(*points[i:i+2])

skipped = 0
for i in range(1, n-1):
    origin = get_dist(*points[i-1:i+1]) + get_dist(*points[i:i+2])
    skip = get_dist(*points[i-1:i+2:2])
    skipped = max(skipped, origin - skip)

print(total_dist - skipped)

arr = list(map(int, input().split()))

for i in range(8):
    arr.append((arr[i] + arr[i + 1]) % 10)

for item in arr:
    print(item, end=' ')
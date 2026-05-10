n, q = map(int, input().split())

arr = list(map(int, input().split()))

for _ in range(q):
    query = list(map(int, input().split()))

    if query[0] == 1:
        print(arr[query[1] - 1])
    elif query[0] == 2:
        if query[1] in arr:
            print(arr.index(query[1]) + 1)
        else:
            print(0)
    else:
        for i in range(query[1] - 1, query[2]):
            print(arr[i], end =" ")
        print()

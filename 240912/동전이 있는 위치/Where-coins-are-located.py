n, m = map(int, input().split())

arr = [
    [0 for _ in range(n)]
    for _ in range(n)
]
arr_coins = [
    list(map(int, input().split())) for _ in range(m)
    ]

for i in arr_coins:
    arr[i[0] - 1][i[1] - 1] = 1

for cols in arr:
    for answer in cols:
        print(answer, end = " ")
    print()
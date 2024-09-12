n, m = map(int, input().split())
arr = [
    [0 for _ in range(n)]
    for _ in range(n)
]

arr_num = [
    list(map(int, input().split()))
    for _ in range(m)
]

for i in arr_num:
    arr[i[0] - 1][i[1] - 1] = i[0] * i[1]

for rows in arr:
    for answer in rows:
        print(answer, end = " ")
    print()
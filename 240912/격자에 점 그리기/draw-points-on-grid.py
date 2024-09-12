n, m = map(int, input().split())
arr = [
    [0 for _ in range(n)]
    for _ in range(n)
]
arr_num = [
    list(map(int, input().split()))
    for _ in range(m)
]

num = 1
for i in arr_num:
    arr[i[0] - 1][i[1] - 1] = num
    num = num + 1

for rows in arr:
    for answer in rows:
        print(answer, end = " ")
    print()
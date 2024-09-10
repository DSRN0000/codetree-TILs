n, m  = map(int, input().split())
arr = [
    [0 for _ in range(m)]
    for _ in range(n)
]

num = 0
for j in range(m):
    if j % 2 == 0:
        for i in range(n):
            arr[i][j] = num
            num += 1

    if j % 2 != 0:
        for k in range(n - 1, -1, -1):
            arr[k][j] = num
            num += 1

for a in arr:
    for b in a:
        print(b, end = " ")
    print()
n, m  = map(int, input().split())
arr = [
    [0 for _ in range(m)]
    for _ in range(n)
]
cnt = 1


for i in range(n):
    for j in range(m):
        arr[i][j] = cnt
        cnt += 1

for a in range(n):
    for b in range(m):
        print(arr[a][b], end = " ")
    print()
n = 5

arr = [
    [0 for _ in range(n)]
    for _ in range(n)
]

for i in range(n):
    arr[0][i] = 1

for j in range(n):
    arr[j][0] = 1

for j in range(1, n):
    for k in range(1, n):
        arr[j][k] = arr[j - 1][k] + arr[j][k - 1]

for row in arr:
    for answer in row:
        print(answer, end = " ")
    print()
n, m = map(int, input().split())

arr1 = [
    list(map(int, input().split()))
    for _ in range(m)
]

arr2 = [
    list(map(int, input().split()))
    for _ in range(n)
]

arr3 = [
    [0] * m for _ in range(n)
]

for i in range(m):
    for j in range(n):
        if arr1[i][j] != arr2[i][j]:
            arr3[i][j] = 1

for a in arr3:
    for b in a:
        print(b, end = " ")
    print()
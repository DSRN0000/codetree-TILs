n = int(input())
arr = list(map(int, input().split()))

while(1):
    if n == 0:
        break
    arr_max = arr[0]
    for i in range(n):
        if arr_max < arr[i]:
            arr_max = arr[i]

    print(arr.index(arr_max) + 1, end = " ")

    n = arr.index(arr_max)
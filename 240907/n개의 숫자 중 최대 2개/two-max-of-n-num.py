n = int(input())
arr = list(map(int, input().split()))

for i in range(n-1):
    for j in range(i + 1, n):
        if arr[i] < arr[j]:
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
print(arr[0], arr[1])
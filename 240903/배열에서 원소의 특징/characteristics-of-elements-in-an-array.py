arr = list(map(int, input().split()))
length = len(arr)
for i in range(length):
    if arr[i] == 0:
        continue
    if arr[i] % 3 == 0:
        print(arr[i-1])
        break
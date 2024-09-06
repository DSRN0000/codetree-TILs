n = int(input())
arr = list(map(int, input().split()))
arr_min = 2 ** 31
arr_max = 1
        
for i in arr:
    if arr_min > i:
        arr_min = i

for j in arr[arr.index(arr_min): ]:
    if arr_max < j:
        arr_max = j
        
print(arr_max - arr_min)
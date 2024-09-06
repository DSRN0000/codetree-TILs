arr = list(map(int, input().split()))
arr_min = 1000
arr_max = 1

for i in arr:
    if i < 500 and arr_max < i:
        arr_max = i
    if i > 500 and arr_min > i:
        arr_min = i
print(arr_max, arr_min)
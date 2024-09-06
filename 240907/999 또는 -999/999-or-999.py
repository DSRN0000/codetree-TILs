# 3자리 이하 정수 주어짐.
# 999, -999 나오면 종료 -> 가장 큰 수 , 가장 작은 수 출력 (999 ,-999 )제외

arr = list(map(int, input().split()))
arr_max = arr[0]
arr_min = arr[0]

for i in arr:
    if i == 999 or i == -999:
        break

    if i > arr_max:
        arr_max = i

    if i < arr_min:
        arr_min = i

print(arr_max, arr_min)
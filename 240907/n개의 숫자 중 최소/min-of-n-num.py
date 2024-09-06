n = int(input())
n_arr = list(map(int, input().split()))
n_arr_min = n_arr[0]

for i in n_arr:
    if i < n_arr_min:
        n_arr_min = i
cnt = n_arr.count(n_arr_min)
print(n_arr_min, cnt)
arr = list(map(int, input().split()))
max_num = arr[0]

for i in arr[1:]:
    if i > max_num:
        max_num = i
print(max_num)
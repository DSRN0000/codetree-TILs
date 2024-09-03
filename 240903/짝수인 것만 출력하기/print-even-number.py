a = int(input())
arr = list(map(int, input().split()))
new_arr = []

for i in range(a):
    if arr[i] % 2 == 0:
        new_arr.append(arr[i])
for j in new_arr:
    print(j, end = " ")
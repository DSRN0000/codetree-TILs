n = int(input())
arr = list(map(int, input().split()))
arr_count = [0] * 1001

for i in arr:
    arr_count[i] += 1

for j in range(1000, 0, -1):
    if arr_count[j] == 1:
        print(j)
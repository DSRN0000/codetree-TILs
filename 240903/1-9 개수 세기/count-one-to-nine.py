count_arr = 10 * [0]

n = int(input())
arr = list(map(int, input().split()))
for i in arr:
    count_arr[i] += 1

for j in range(1,10):
    print(count_arr[j])
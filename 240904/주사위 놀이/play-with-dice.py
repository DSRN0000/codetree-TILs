arr = [0] * 7
num_arr = list(map(int, input().split()))
for i in num_arr:
    arr[i] += 1

for j in range(1, 7):
    print(j, "-", arr[j])
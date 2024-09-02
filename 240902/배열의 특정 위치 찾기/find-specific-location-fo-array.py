arr = list(map(int, input().split()))
n = len(arr)

sum = 0
avg = 0
cnt = 0

for i in range(n):
    if (i + 1) % 2 == 0:
        sum += arr[i]
    if (i + 1) % 3 == 0:
        avg += arr[i]
        cnt += 1
        
avg /= cnt

print(sum, avg)
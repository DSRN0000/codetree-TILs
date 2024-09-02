arr = list(map(int, input().split()))
sum = 0
cnt = -1
for i in arr:
    cnt += 1
    if i == 0:
        break
sum = arr[cnt-3] + arr[cnt-2] + arr[cnt-1] 
print(sum)
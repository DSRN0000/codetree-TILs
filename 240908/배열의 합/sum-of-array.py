arr = [list(map(int, input().split())) for _ in range(4)]
n = len(arr)
sum = 0
for i in range(n):
    for j in arr[i]:
        sum += j
    print(sum)
    sum = 0
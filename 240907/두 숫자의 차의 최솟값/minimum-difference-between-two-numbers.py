n = int(input())
arr = list(map(int, input().split()))

num = 101

for i in range(n - 1):
    for j in range(i + 1, n):
        if arr[j] - arr[i] < num:
            num = arr[j] - arr[i]
print(num)
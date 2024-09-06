n = int(input())
arr = list(map(int, input().split()))
max_profit = 0
        
for i in range(n):
    for j in range(i + 1, n):
        result = arr[j] - arr[i]

        if max_profit < result:
            max_profit = result

print(max_profit)
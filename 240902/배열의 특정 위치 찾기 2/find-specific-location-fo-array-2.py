arr = list(map(int, input().split()))
sum1 = 0
sum2 = 0
for i in range(10):
    if (i % 2) != 0:
        sum1 += arr[i]
    if (i % 2) == 0:
        sum2 += arr[i]
a = max(sum1,sum2)
b = min(sum1,sum2)
result = a - b
print(result)
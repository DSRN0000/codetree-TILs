arr = list(map(int, input().split()))
for _ in range(2,10):
    arr.append(arr[-1] + 2*arr[-2])

for i in arr:
    print(i, end = " ")
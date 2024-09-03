arr = list(map(int, input().split()))
length = len(arr)
for i in range(length, 10):
    arr.append((arr[-1]+arr[-2]) % 10)

for i in arr:
    print(i, end = " ")
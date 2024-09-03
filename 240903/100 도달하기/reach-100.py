arr = [1]
n = int(input())
arr.append(n)
i = 1
while (arr[i] < 100):
    arr.append(arr[-1] + arr[-2])
    i += 1

for i in arr:
    print(i, end = " ")
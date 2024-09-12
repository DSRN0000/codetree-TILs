n = int(input())

arr = [input() for _ in range(n)]

cnt = 0
count = 0
for i in arr:
    if "a" == i[0]:
        cnt += 1
    count += len(i)
print(count, cnt)
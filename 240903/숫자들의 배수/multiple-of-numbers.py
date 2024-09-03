a = int(input())
arr = []
cnt = 0

for i in range(1,11):
    num = a * i
    arr.append(num)

for j in arr:
    print(j, end = " ")
    if j % 5 == 0:
        cnt += 1
    if cnt >=2:
        break
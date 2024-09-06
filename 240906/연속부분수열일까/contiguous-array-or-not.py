a, b = map(int, input().split())
a_arr = list(map(int, input().split()))
b_arr = list(map(int, input().split()))
cnt = 0

for i in range(b):
    if b_arr[i] in a_arr:
        num = a_arr.index(b_arr[i])
        for j in range(num, a):
            k = i
            if a_arr[j] == b_arr[k] and k <= b:
                cnt += 1
                k += 1
            else:
                break
    if cnt < 2:
        cnt = 0
if cnt >= 2:
    print("Yes")
if cnt < 2:
    print("No")
a = input()
b = input()

len_a = len(a)
len_b = len(b)

cnt = 0
for i in range(len_a):
    if b == a[i:i+len_b]:
        print(i)
        cnt += 1
        break

if cnt == 0:
    print(-1)
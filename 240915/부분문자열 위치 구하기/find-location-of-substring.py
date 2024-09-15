a = input()
b = input()

len_a = len(a)
len_b = len(b)

cnt = 0
for i in range(len_a - len_b):
    if b == a[i:i+len_b]:
        print(a.index(b[0]))
        cnt += 1
        break
        
if cnt == 0:
    print(-1)
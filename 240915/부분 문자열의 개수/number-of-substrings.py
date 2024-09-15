A = input()
B = input()

len_A = len(A)
len_B = len(B)

cnt = 0
for i in range(len_A):
    if B == A[i:i+len_B]:
        cnt += 1
print(cnt)
a = input()
n = int(input())
len_a = len(a)
if len_a >= n:
    for i in range(len_a - 1 , len_a - n -1, -1):
        print(a[i], end="")
if len_a < n:
    for j in range(len_a - 1, -1, -1):
        print(a[j])
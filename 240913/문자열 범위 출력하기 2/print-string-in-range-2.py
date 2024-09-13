a = input()
n = int(input())
len_a = len(a)
for i in range(len_a - 1 , len_a - n -1, -1):
    print(a[i], end="")
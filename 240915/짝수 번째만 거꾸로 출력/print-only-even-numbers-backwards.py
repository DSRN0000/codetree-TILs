a = input()

len_a = len(a)
for i in range(len_a - 1, -1, -1):
    if i % 2 != 0:
        print(a[i], end = "")
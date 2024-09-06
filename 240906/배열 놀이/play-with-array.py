n, q = map(int, input().split())
n_arr = list(map(int, input().split()))

for i in range(q):
    a = list(map(int, input().split()))
    if a[0] == 1:
        print(n_arr[a[1] - 1])
    if a[0] == 2:
        if a[1] in n_arr:
            print(n_arr.index(a[1]) + 1)
        else:
            print(0)
    if a[0] == 3:
        for i in range(a[1] - 1, a[2]):
            print(n_arr[i], end = " ")
        print()
    a = []
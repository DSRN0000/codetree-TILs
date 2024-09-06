a, b = map(int, input().split())
a_arr = list(map(int, input().split()))
b_arr = list(map(int, input().split()))
cnt = 0

for i in range(a):
    success = True

    for j in range(b):
        if i + j >= a:
            success = False
            break

        if a_arr[i + j] != b_arr[j]:
            success = False
            break
    if success:
        print("Yes")
        sys.exit()
print("No")
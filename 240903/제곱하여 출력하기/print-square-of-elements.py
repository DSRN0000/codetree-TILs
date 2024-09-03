a = int(input())
arr = list(map(int, input().split()))
new_arr = [i * i for i in arr]

for j in range(a):
    print(new_arr[j], end = " ")
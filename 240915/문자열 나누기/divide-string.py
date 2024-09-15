n = int(input())
arr = input().split()
arr = "".join(arr)
len_arr = len(arr)

for i in range(0, len_arr, 5):
    print(arr[i:i+5])
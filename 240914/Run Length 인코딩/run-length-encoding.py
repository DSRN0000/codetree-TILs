a = input()
len_a = len(a)
arr = []
arr_answer = []

for i in range(len_a - 1):
    if len(arr) == 0:
        arr.append(a[i])

    if a[i + 1] in arr:
        arr.append(a[i + 1])

    if a[i + 1] not in arr or i == len_a - 2:
        arr_answer.append(arr[0])
        arr_answer.append(len(arr))
        arr.clear()

print(len(arr_answer))
for j in arr_answer:
    print(j, end= "")
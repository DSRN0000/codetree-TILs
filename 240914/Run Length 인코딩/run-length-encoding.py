a = input()
len_a = len(a)
arr = []
arr_answer = []

for i in range(len_a):
    if len(arr) == 0:
        arr.append(a[i])

    if i < len_a - 1 and a[i + 1] in arr:
        arr.append(a[i + 1])

    if i == len_a - 1 or a[i + 1] not in arr:  # 마지막 문자이거나 다음 문자가 다를 때
        arr_answer.append(arr[0])  # 현재 문자 추가
        arr_answer.append(len(arr))  # 연속된 문자 수 추가
        arr.clear()

print(len(arr_answer))
for j in arr_answer:
    print(j, end='')
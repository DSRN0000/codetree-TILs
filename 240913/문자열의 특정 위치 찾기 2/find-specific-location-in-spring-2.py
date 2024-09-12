arr = ["apple", "banana", "grape", "blueberry", "orange"]

input_char = input()

cnt = 0
for i in arr:
    if input_char == i[2]:
        print(i)
        cnt += 1
    if input_char == i[3]:
        print(i)
        cnt += 1
print(cnt)
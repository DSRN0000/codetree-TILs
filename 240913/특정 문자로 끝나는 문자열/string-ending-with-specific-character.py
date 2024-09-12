a = [input() for _ in range(10)]
b = input()

cnt = 0
for i in a:
    if b == i[-1]:
        print(i)
        cnt += 1

if cnt == 0:
    print("None")
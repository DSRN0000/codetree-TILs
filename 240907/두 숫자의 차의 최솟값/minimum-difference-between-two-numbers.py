n = int(input())
arr = list(map(int, input().split()))

num = 101

for i in range(n):
    for j in range(i + 1, n):
        if j - i < num:
            num = j - i
print(num)
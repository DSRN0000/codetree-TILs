a = list(input())
len_a = len(a)
first = a[0]
second = a[1]

for i in range(len_a):
    if a[i] == second:
        a[i] = first
print("".join(a))
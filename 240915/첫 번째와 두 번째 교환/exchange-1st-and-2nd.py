a = input()
a = list(a)
len_a = len(a)
first = a[0] 
second = a[1]

for i in range(len_a):
    if a[i] == first:
        a[i] = second
        continue
    if a[i] == second:
        a[i] = first
        continue
print("".join(a))
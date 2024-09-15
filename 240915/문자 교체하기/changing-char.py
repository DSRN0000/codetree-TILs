a, b = input().split()
a = list(a)
b = list(b)

b[0:2] = a[0:2]
print("".join(b))
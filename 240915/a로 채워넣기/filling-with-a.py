a = input()
a = list(a)
a[1] = 'a'
a[-2] = 'a'

a = "".join(a)
print(a)
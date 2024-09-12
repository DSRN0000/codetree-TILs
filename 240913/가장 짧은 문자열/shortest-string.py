a = input()
b = input()
c = input()

len_a = len(a)
len_b = len(b)
len_c = len(c)

print(max(len_a, len_b, len_c) - min(len_a, len_b, len_c))
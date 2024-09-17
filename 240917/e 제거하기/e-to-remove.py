s = input()
len_s = len(s)
for i in range(len_s):
    if s[i] == 'e':
        s = s[:i] + s[i + 1: len_s]
        break
print(s)
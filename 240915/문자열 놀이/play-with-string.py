s, q = input().split()
s = list(s)
len_s = len(s)
q = int(q)
qq  = [
        list(input().split())
        for _ in range(q)
]

for i in qq:
    if i[0] == "1":
        tmp = s[int(i[1]) - 1]
        s[int(i[1]) - 1] = s[int(i[2]) - 1]
        s[int(i[2]) - 1] = tmp
        print("".join(s))
        continue
    
    if i[0] == "2":
        for j in range(len_s):
            if i[1] == s[j]:
                s[j] = i[2]
        print("".join(s))
        continue
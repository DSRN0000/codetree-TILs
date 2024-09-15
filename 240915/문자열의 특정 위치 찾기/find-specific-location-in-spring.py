a, b = input().split()
if b in a:
    print(a.index(b))
if b not in a:
    print("No")
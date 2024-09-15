a = list(input())
len_a = len(a) - 1

while(1 <= len_a):
    n = int(input())
    if len_a < n:
        a.pop(-1)
        print("".join(a))
    if len_a >= n:
        a.pop(n)
        print("".join(a))
    len_a -= 1
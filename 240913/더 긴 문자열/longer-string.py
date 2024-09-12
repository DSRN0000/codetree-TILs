a, b = input().split()

len_a = len(a)
len_b = len(b)



if len_a == len_b:
    print("same")

if len_a < len_b:
    print(b, len_b)
    
if len_b < len_a:
    print(a, len_a)
arr = [0] * 5
for _ in range(3):
    s, t = input().split()
    t = int(t)
    
    if s == "Y" and t >= 37:
        num = 1
    if s == "Y" and t < 37:
        num = 2
    if s == "N" and t >= 37:
        num = 3
    if s == "N" and t < 37:
        num = 4
    
    arr[num] += 1
        
for i in range(1, 5):
    print(arr[i], end =" ")

if arr[1] >= 2:
    print("E")
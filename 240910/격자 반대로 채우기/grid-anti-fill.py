n = int(input())
arr = [
    [0 for _ in range(n)]
    for _ in range(n)
]

number = 1
curr_row = n - 1 
curr_col = n
while(0 <= curr_row and 0 <= curr_col):

    if curr_col == n:
        for _ in range(n):
            curr_col -= 1
            arr[curr_col][curr_row] = number
            number += 1
        curr_row -= 1
        
    if curr_col == 0:
        for _ in range(n):
            arr[curr_col][curr_row] = number
            curr_col += 1
            number += 1
        curr_row -= 1

for i in arr:
    for j in i:
        print(j, end = " ")
    print()
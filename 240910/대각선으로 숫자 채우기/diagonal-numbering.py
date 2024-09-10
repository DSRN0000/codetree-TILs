n, m = map(int, input().split())

arr = [
    [0 for _ in range(m)]
    for _ in range(n)
]

count = 1
for start_col in range(m):
    curr_row = 0
    curr_col = start_col

    while 0 <= curr_col and curr_row < n:
        arr[curr_row][curr_col] = count
        
        curr_row += 1
        curr_col -= 1
        count += 1

for start_row in range(1, n):
    curr_row = start_row
    curr_col = m - 1

    while 0 <= curr_col and curr_row < n:
        arr[curr_row][curr_col] = count

        curr_row += 1
        curr_col -= 1
        count += 1
        
for a in arr:
    for b in a:
        print(b, end = " ")
    print()
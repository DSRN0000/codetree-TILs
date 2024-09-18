n = int(input())
x, y = 0, 0
dx, dy = [1, -1, 0, 0], [0, 0, -1, 1]

for i in range(n):
    n1, n2 = input().split()
    n2 = int(n2)

    if n1 == 'E':
        move = 0
    if n1 == 'W':
        move = 1
    if n1 == 'S':
        move = 2
    if n1 == "N":
        move = 3
    
    x += dx[move] * n2
    y += dy[move] * n2

print(x, y)
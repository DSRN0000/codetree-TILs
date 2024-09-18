direction = 0 # 북, 동, 남, 서
x, y = 0, 0
dx, dy = [0,1,0,-1], [1,0,-1,0]

_input = input()
len__input = len(_input)

for i in _input:
    if i == 'L':
        direction = (direction - 1 + 4) % 4
    elif i == 'R':
        direction = (direction + 1) % 4
    if i == 'F':
        x = x + dx[direction]
        y = y + dy[direction]
print(x, y)
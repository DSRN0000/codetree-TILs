direction = 0 # 북, 동, 남, 서
x, y = 0, 0
dx, dy = [0,1,0,-1], [1,0,-1,0]

_input = input()
len__input = len(_input)

for i in range(len__input):
    if _input[i] == 'L':
        direction -= 1
    elif _input[i] == 'R':
        direction += 1
    if _input[i] == 'F':
        x = x + dx[direction]
        y = y + dy[direction]
print(x, y)
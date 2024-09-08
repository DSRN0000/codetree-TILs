# ord() -> 문자를 유니코드로 변환
# chr() -> 유니코드를 문자로 변환
# A -> 65, a -> 97,  0 -> 48

arr = [list(input().split()) for _ in range(5)]

for i in range(5):
    for j in range(3):
        arr[i][j] = chr(ord(arr[i][j]) + ord('A') - ord('a'))
        print(arr[i][j], end = " ")
    print()
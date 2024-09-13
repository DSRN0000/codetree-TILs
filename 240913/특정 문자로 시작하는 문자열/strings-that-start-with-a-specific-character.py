n = int(input())
arr = [input() for _ in range(n)]
a = input()

answer_cnt = 0
answer_len = 0
for i in arr:
    if a == i[0]:
        answer_cnt += 1
        answer_len += len(i)

print(answer_cnt, f'{answer_len / answer_cnt :.2f}')
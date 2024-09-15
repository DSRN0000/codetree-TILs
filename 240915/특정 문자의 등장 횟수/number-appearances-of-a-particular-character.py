a = input()
len_a = len(a)
ee_cnt = 0
eb_cnt = 0
for i in range(len_a):
    if "ee" == a[i:i+2]:
        ee_cnt += 1
    if "eb" == a[i:i+2]:
        eb_cnt += 1
print(ee_cnt, eb_cnt)
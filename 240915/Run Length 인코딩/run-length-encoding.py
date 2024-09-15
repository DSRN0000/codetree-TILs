a = input()
encoded = ""

curr_char = a[0]
num_char = 1
for traget_char in a[1:]:
    if traget_char == curr_char:
        num_char += 1
    if traget_char != curr_char:
        encoded += curr_char
        encoded += str(num_char)

        curr_char = traget_char
        num_char = 1
    
encoded += curr_char
encoded += str(num_char)

print(len(encoded))
print(encoded)
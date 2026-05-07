words = input().split()

len_a = len(words[0])
len_b = len(words[1])

if len_a > len_b:
    print(words[0], len_a)
elif len_a < len_b:
    print(words[1], len_b)
else:
    print('same')
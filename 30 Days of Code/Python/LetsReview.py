n = int(input())

for _ in range(n):
    words = [char for char in input()]
    odd = ''
    even = ''
    flag = True

    for s in range(len(words)):
        if flag:
            even += words[s]
        else:
            odd += words[s]
        flag = not flag

    print(even, odd)

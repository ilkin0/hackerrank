import math
import os
import random
import re
import sys


if __name__ == '__main__':
    N = int(input())

    ans = ''
    if N % 2 != 0:
        ans = 'Weird'
    else:
        if n >= 2 and n <= 5:
            ans = 'Not Weird'
        elif n >= 6 and n <= 20:
            ans = 'Weird'
        elif n > 20:
            ans = 'Not Weird'

    print(ans)

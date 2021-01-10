#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.


def solve(meal_cost, tip_percent, tax_percent):
    tipCost = meal_cost * 0.01 * tip_percent
    taxCost = meal_cost * 0.01 * tax_percent

    totalCost = round(meal_cost + taxCost + tipCost)
    print(totalCost)


if __name__ == '__main__':
    meal_cost = float(input())

    tip_percent = int(input())

    tax_percent = int(input())

    solve(meal_cost, tip_percent, tax_percent)

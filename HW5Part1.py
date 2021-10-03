#!/usr/bin/python
# -*- coding: utf-8 -*-
# split input into 2 parts : name and age
parts = input().split()
name = parts[0]
names = []  # adding these two lists to save names and ages
ages = []

while name != '-1':

    try:

        age = int(parts[1]) + 1
    except:

        age = 0

    # appending name and age to these lists ,  after the while block ends we will print them

    names.append(name)
    ages.append(age)

    # get next line

    parts = input().split()
    name = parts[0]

for i in range(0, len(names)):
    print('{} {}'.format(names[i], ages[i]))

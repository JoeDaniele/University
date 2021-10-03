parts = input().split()
name = parts[0]
names = []
ages = []
# arrays storing names/ages
while name != '-1':

    try:

        age = int(parts[1]) + 1
    except:

        age = 0

    # appending name and age to arrays, prints when loop ends
    names.append(name)
    ages.append(age)

    parts = input().split()
    name = parts[0]

for i in range(0, len(names)):
    print('{} {}'.format(names[i], ages[i]))

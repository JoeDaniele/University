 def read_da_file(something):
      dict1 = {}
       with open(something, 'r') as infile:
            lines = infile.readlines()
            for index in range(0, len(lines) - 1, 2):
                if lines[index].strip() == '':
                    continue
                count = int(lines[index].strip())
                show = lines[index + 1].strip()
                if count in dict1.keys():
                    show_list = dict1.get(count)
                    show_list.append(show)
                else:
                    dict1[count] = [show]

        return dict1


def output_keys(dict1, filename):
    with open(filename, 'w+') as q:
        for key in sorted(dict1.keys()):
            q.write('{}: {}\n'.format(key, '; '.join(dict1.get(key))))

            print('{}: {}'.format(key, '; '.join(dict1.get(key))))


def output_titles(dict1, filename):
    titles = []

    for title in dict1.values():
        titles.extend(title)

    with open(filename, 'w+') as outfile:

        for title in sorted(titles):
            outfile.write('{}\n'.format(title))
            print(title)


def main(x):
    file_name = x
    dict1 = read_da_file(file_name)
    if dict1 is None:
        print('Error: Invalid file name provided: {}'.format(file_name))

        return
    output_filename_1 = 'output_keys.txt'
    output_filename_2 = 'output_titles.txt'
    output_keys(dict1, output_filename_1)
    output_titles(dict1, output_filename_2)


user_input = input()
main(user_input)

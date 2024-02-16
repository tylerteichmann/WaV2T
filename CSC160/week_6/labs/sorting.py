shows = {}

with open(input(), 'r') as file:
    for line in file:
        if int(line.rstrip()) in list(shows.keys()):
            shows[int(line.rstrip())].append(file.readline().rstrip())
        else:
            shows[int(line.rstrip())] = [ file.readline().rstrip() ]


with open("output_keys.txt", 'w') as file:
    for item in sorted(shows.items(), reverse=True):
        file.write(f"{str(item[0])}: {'; '.join(item[1])}\n")


with open("output_titles.txt", 'w') as file:
    string = f'{"\\n".join(sorted([show for value in shows.values() for show in value], reverse=True))}'
    file.write(string)
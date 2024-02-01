input = input()
character = input[0]
phrase = input[2:]
count = phrase.count(character)

if count != 1:
    character += "'s"

print(f"{count} {character}")
def print_all_permutations(permList, nameList):
    # TODO: Implement method to create and output all permutations of the list of names.
    if len(nameList) == 1:
        return [nameList]
    for i, name in enumerate(nameList):
        for p in print_all_permutations(permList, nameList[:i] + nameList[i+1:]):
            permList.extend(name,p)
    print(permList)
    

if __name__ == "__main__": 
    nameList = input().split(' ')
    permList = []
    print_all_permutations(permList, nameList)
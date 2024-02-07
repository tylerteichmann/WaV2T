contacts = {contact.split(',')[0]:contact.split(',')[1] for contact in input().split()}
print(contacts[input()])
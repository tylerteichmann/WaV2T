import os
import sys

print(sys.path[5])
os.chdir(sys.path[5])
os.getcwd()
for list in os.listdir():
    print(list)
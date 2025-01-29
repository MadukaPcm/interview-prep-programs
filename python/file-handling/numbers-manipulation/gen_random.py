"""
GENERATING RANDOM NUMBERS & SAVING TO FILE.
"""
import random 
import os 

random_nums = [str(random.randint(1,20)) for _ in range(50)]

if not os.path.exists("random.txt"):
  with open("random.txt","x") as f:
    print("File => ",f)
    for num in random_nums:
      f.write(num+"\n")
print(random_nums)



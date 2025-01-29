"""
Variable initialization.
"""
import os 
from collections import Counter 

count = 0 
num_sum = 0 

def amount():
  global count
  count += 1
  
def sum_nums(num):
  global num_sum
  num_sum += num
  
def average():
  return round((num_sum/count),2)

# @staticmethod
def write_file():
  with open("result.txt","w") as f:
    f.write("========== RESULTS AFTER NUM PROCESSING ==========\n\n")
    f.write("Total numbers in a file is : {}\n".format(count))
    f.write("Sum of numbers in a file is : {}\n".format(num_sum))
    f.write("Average of numbers in the file is : {}\n".format(average()))
    
def read_file_num_to_list():
  if os.path.exists("random.txt"):
    file = open("random.txt")
    # numbers = [int(num) for num in file if num.strip().isdigit()]
    # print("read_file_num_to_list ",numbers)
    numbers = []
    for num in file:
      if num.strip().isdigit():
        numbers.append(int(num))
      else:
        continue
    return numbers
  else:
    return None
  
def occurances_of_num(numbers=None):
  if numbers is None:
    print("Numbers is None")
  occurances = Counter(numbers)
  return occurances
  
with open("random.txt") as f:
  for i in f:
    amount()
    sum_nums(int(i))
  print("\n")
  print("========== RESULTS AFTER NUM PROCESSING ==========")
  print("Total numbers in a file is ",count)
  print("Sum of numbers in a file is ",num_sum)
  print("The average is: ",average())

write_file()

"""
OCCURANCES OF NUMBER IN A FIlE. 
"""
occurances_of_num_result = occurances_of_num(read_file_num_to_list())
print("\n")
print("====== OCCURANCE OF NUMBERS(Frequencies) =======")
print("No  Freq(f)")
for num,count in occurances_of_num_result.items():
  print("{}    {}".format(num,count))

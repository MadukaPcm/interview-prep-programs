import os
from collections import Counter
nums_file = "./nums.txt"

# Function for checking min num in a row
def find_max(list):
  max_value = list[0]
  for num in list:
    if max_value < num:
      max_value = num
  return max_value

def find_min(list):
  min_value = list[0]
  for num in list:
    if min_value > num:
      min_value = num
  return min_value

def find_average(list):
  sum = 0 
  count = 0
  for num in list:
    sum += num
    count += 1
  return sum / count
      
# Reading data from file.
rows = []
def read_file(nums_file):
  if not os.path.exists(nums_file):
    print(f"File {nums_file} does not exist".format(str(nums_file)))
    return None
  
  with open(nums_file, 'r') as file:
    file.seek(0)
    # lines = file.readlines()
    for line in file:
      row = line.strip().split()
      row = [int(num) for num in row]
      rows.append(row)
    return rows

# Rendering computed value 
def render_result(nums_file):
  print("\n<==== My Row Data ====>")
  print(read_file(nums_file))

  print("\n<====  Row Statistics  ====>")
  index = 0
  for row in rows:
    max_num = find_max(row)
    min_num = find_min(row)
    average = find_average(row)
    index += 1
    
    print("Row " +str(row))
    print("Max No in row {} => {}".format(index,max_num))
    print("Min No in row {} => {}".format(index,min_num))
    print("Avrg {:.2f}".format(average))
    print("")
    

# Computing frequency from the text-file-data. 
def compute_frequency(nums_file):
  with open(nums_file, 'r') as file:
    data = file.read().strip().split()
    data = [int(num) for num in data] 
    data = sorted(data)
    frequency = Counter(data)
    
    print("Number(No)  Frequency(F)")
    for item, freq in frequency.items():
      print("{}    -      {}".format(item,freq))
      
  
render_result(nums_file)
compute_frequency(nums_file)
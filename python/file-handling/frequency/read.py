"""
READING AND MANIPULATING DATA FROM FILE. 
"""

import os 
from collections import Counter 

file_path = "./text_file.txt"

# data = [45,78,90,87,45,90]

def reead_file(file_path):
  if os.path.exists(file_path):
    with open(file_path,mode="r") as f:
      data = f.read().strip().split()
      frequency = Counter(data)
      
      print("\n")
      print("====== FREQUENCY OF NUMBERS ======")
      print("No   Freq(f)")
      for num,count in frequency.items():
        print("{}   {}".format(num,count))
    
    return data 
  else:
    print("File Does Not Exist")
    return None 
  
def write_to_file(data):
  with open("result.txt","w") as f: 
    for d in data:
      f.write(str(d)+" ")
      
    
reead_file(file_path)
write_to_file(reead_file(file_path))



  
# def write_to_file(file_path, data):
#   with open(file_path, mode='w') as file:
#     for i in data:
#       file.write(str(i) + " ")
    
#     # print("Inserted data: ",output)
    

#     # return outpu/t

# print("Wrote data :",write_to_file(file_path,data))
# print("Read data : ",reead_file(file_path))  
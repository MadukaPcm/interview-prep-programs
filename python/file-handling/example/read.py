
file_path = "./text_file.txt"

# data = "Maduka moja"
data = [45,78,90,87,45,90]
from collections import Counter
def reead_file(file_path):
  with open(file_path, mode='r') as file:
    
    data = file.read().strip().split()
    frequency = Counter(data)
    for number , count in frequency.items():
      print(f"number: {number}")
      print(f"count: {count}")
    
    print("Available data ",data)
    
    return data
  
def write_to_file(file_path, data):
  with open(file_path, mode='w') as file:
    for i in data:
      file.write(str(i) + " ")
    
    # print("Inserted data: ",output)
    

    # return outpu/t

print("Wrote data :",write_to_file(file_path,data))
print("Read data : ",reead_file(file_path))  
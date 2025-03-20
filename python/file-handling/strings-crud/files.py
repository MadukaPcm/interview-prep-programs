import os 
'''
  ==============  HINTS   ================
  r = Read
  a = Append
  W = Write
  x = Create
'''

# file_sample = open("name_list.txt","x")
# file_sample_read = open("name_list.txt")
# print(file_sample_read.read())

f = open("names.txt")

# print(f.read())  # 1. Reading the whole file. 
# print(f.read(4))  # 2. Reading fisrt 4 letters in file.

# print(f.readline()) # 3. Reading the file line in a file. 
# print(f.readline()) # 4. Reading the second line. 

for line in f: # 5. Reading all lines in a test file.
  print(line)
  
try:  # 6. Handling file if does not exist. 
  f = open("name.txt")
  print(f.read())
except:
  print("File not found || Failed to load file")
finally:
  f.close()
  
'''
Append || Create the file if not exist. 
'''
f = open("name_list.txt","a")
f.write("Kumar\n")
f.close()

f = open("name_list.txt")
print(f.read())
f.close()


'''
Write (Overwrite). 
'''
f = open("context.txt","w")
f.write("I deleted all of the context.\n")
f.close()

f = open("context.txt")
print(f.read())
f.close()

""" 
TWO WAYS TO CREATE A FILE. 
"""
f = open("name_list.txt","w") # Opens a file for writting | create a file if does not exist. 
f.close()

if not os.path.exists("pcm.txt"): # Check if the does not exist and create new.
  f = open("pcm.txt","x")
  f.close()
  
"""
DELETING FILE. 
Avoid an error if file does not exist.
"""
if os.path.exists("pcm.txt"):
  os.remove("pcm.txt")
else:
  print("File wish to delete does not exist.")
  
"""
USING WITH WITH FILE HANDLING
"""
with open("more_names.txt") as f:
  content = f.read()
  f.close()
  
with open("names.txt","w") as f:
  f.write(content)
  f.close()
  
with open("names.txt","a") as f:
  file = open("more_names.txt")
  for name in file:
    f.write(name+"\n")
  f.close()
  

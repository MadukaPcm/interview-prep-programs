# ===== OCCURANCE OF CHAR IN A STRING =====
import sys

statement = input("Enter the statement: ")
character = input("Enter the character: ")

if statement == '' or character == '':
  print("Statement or Character Cann't be Null")
  sys.exit()

try:
  print("Occurance of {} in {} is {} times.".format(
    character, 
    statement, 
    statement.count(character)
  ))
except Exception as e:
  print("An error occured : {}".format(e))
  sys.exit()
  
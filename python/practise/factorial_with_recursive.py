# =========== FACTORIAL OF A NUMBER ==========
import sys 

init = 1
while init:
  def factorial(n):
    if(n == 1 or n == 0):
      return 1
    
    return n * factorial(n-1)

  num = int(input("Enter a number: "))
    
  if num < 0 or num is None:
    print("The number can not be factored!!\n")
    sys.exit()
  
  try:
    print("The Factorial of {} is {}\n".format(num, factorial(num)))
  except Exception as e:
    print("An error occured: {}".format(e))
    sys.exit()
    

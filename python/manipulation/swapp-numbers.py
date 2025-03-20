
class NumberManipulation:
  
  @staticmethod
  def swappTwoNumbers(a,b):
    
    numbers_before_swapp = f"\nBefore swapp-Value of a = {a}, b = {b}"
    
    a = a + b
    b = a - b
    a = a - b 
    
    numbers_After_swapp = f"After swapp-Value of a = {a}, b = {b}\n"
    
    return numbers_before_swapp + "\n" + numbers_After_swapp
  
classInstance = NumberManipulation.swappTwoNumbers(5,10)
print(str(classInstance))

    
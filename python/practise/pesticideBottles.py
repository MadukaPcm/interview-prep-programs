# ======= PesticideBottles =======

bottles = [1, 3, 5, 10, 15, 20]
bottles = sorted(bottles, reverse=True)  # Sort in descending order

area = int(input("Enter area size in litres: "))

# Calculate the total capacity of all bottles
total_capacity = sum(bottles)

# Check if the area is greater than the total capacity
if area > total_capacity:
  print("Error: The area is larger than the total capacity of all bottles.")
else:
  used_bottles = []
  for bottle in bottles:
    while area >= bottle:
      used_bottles.append(bottle)
      area -= bottle

  print("Bottles used:")
  for used_bottle in used_bottles:
    print(used_bottle)
  
  if area > 0:
    print(f"Remaining area that cannot be covered: {area} litres")
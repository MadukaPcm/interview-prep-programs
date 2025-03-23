# ======= PesticideBottles =======

bottles = [1, 3, 5, 10, 15, 20]
bottles = sorted(bottles, reverse=True)  # Sort in descending order

area = int(input("Enter area size in litres: "))

remainedArea = area
count = 0

for bottle in bottles:
  if remainedArea >= bottle:
    count = int(remainedArea/bottle)
    remainedArea %= bottle
    print("{} little of bottle {} bottles.".format(bottle,count))

if remainedArea > 0:
  print("No enough bottle to satisfy the ramained area.")
  
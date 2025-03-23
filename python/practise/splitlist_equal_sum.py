
def split_array_equal_sum(arr):
  total_sum = sum(arr) 
  
  if total_sum % 2 != 0:
    return None
  
  target_sum = total_sum // 2  # Target sum for each part
  left_sum = 0  # Initialize left sum
  
  # Iterate through the array to find the split point    
  for i in range(len(arr)):
    left_sum += arr[i]  # Add the current element to the left sum
    
    # If the left sum equals the target sum, return the split point
    if left_sum == target_sum:
      return i  # Return the index where the array can be split

  # If no split point is found, return None
  return None

# Example usage
arr = [1, 2, 3, 4, 5, 5,]
split_index = split_array_equal_sum(arr)

if split_index is not None:
  print("Array can be split into two parts with equal sum:")
  print("First part:", arr[:split_index + 1])
  print("Second part:", arr[split_index + 1:])
else:
  print("Array cannot be split into two parts with equal sum.")
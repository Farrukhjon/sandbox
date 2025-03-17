
# List comprehension
nums_squared_lc = [num**2 for num in range(5)]

print(f"List comprehension: {nums_squared_lc}")

#Generator expression
nums_squared_gc = (num**2 for num in range(5))
print(f"Generator expression: {nums_squared_gc}")
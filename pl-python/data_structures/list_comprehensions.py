# Syntax of list comprehension:
# [<expression> for <item> in  <iterable> if <condition>]

result = [x ** 2 for x in range(1, 100) if x % 2 ==0]
print(f"result = {result}")

val = [pow(num, 2) for num in range(10)]
print(val)

print(sum([num * 2 for num in range(1, 100)]))
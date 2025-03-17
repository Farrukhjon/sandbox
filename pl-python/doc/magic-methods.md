# The Magic Methods

## The most commonly used magic methods in Python

| **Magic Method** | **Description**                                                     | **Example**                                                                |
|------------------|---------------------------------------------------------------------|----------------------------------------------------------------------------|
| `__init__`       | Initializes a new instance of the class.                            | `class A: def __init__(self, x): self.x = x`                               |
| `__del__`        | Called when an object is about to be destroyed.                     | `class A: def __del__(self): print("Deleted")`                             |
| `__repr__`       | Returns an official string representation of the object.            | `class A: def __repr__(self): return f"A({self.x})"`                       |
| `__str__`        | Returns a user-friendly string representation of the object.        | `class A: def __str__(self): return f"Value: {self.x}"`                    |
| `__bytes__`      | Converts the object to a byte representation.                       | `class A: def __bytes__(self): return bytes(self.x)`                       |
| `__format__`     | Implements custom string formatting logic.                          | `class A: def __format__(self, fmt): return f"{self.x:{fmt}}"`             |
| `__len__`        | Returns the length of the object.                                   | `class A: def __len__(self): return len(self.x)`                           |
| `__getitem__`    | Retrieves an item at a specific index or key.                       | `class A: def __getitem__(self, key): return self.data[key]`               |
| `__setitem__`    | Sets an item at a specific index or key.                            | `class A: def __setitem__(self, key, value): self.data[key] = value`       |
| `__delitem__`    | Deletes an item at a specific index or key.                         | `class A: def __delitem__(self, key): del self.data[key]`                  |
| `__iter__`       | Returns an iterator object.                                         | `class A: def __iter__(self): return iter(self.data)`                      |
| `__next__`       | Returns the next item from the iterator.                            | `class A: def __next__(self): raise StopIteration`                         |
| `__contains__`   | Implements the `in` operator for membership testing.                | `class A: def __contains__(self, item): return item in self.data`          |
| `__call__`       | Makes the object callable like a function.                          | `class A: def __call__(self): return "Called!"`                            |
| `__eq__`         | Implements the equality operator (`==`).                            | `class A: def __eq__(self, other): return self.x == other.x`               |
| `__ne__`         | Implements the inequality operator (`!=`).                          | `class A: def __ne__(self, other): return self.x != other.x`               |
| `__lt__`         | Implements the less-than operator (`<`).                            | `class A: def __lt__(self, other): return self.x < other.x`                |
| `__le__`         | Implements the less-than-or-equal-to operator (`<=`).               | `class A: def __le__(self, other): return self.x <= other.x`               |
| `__gt__`         | Implements the greater-than operator (`>`).                         | `class A: def __gt__(self, other): return self.x > other.x`                |
| `__ge__`         | Implements the greater-than-or-equal-to operator (`>=`).            | `class A: def __ge__(self, other): return self.x >= other.x`               |
| `__add__`        | Implements addition (`+`).                                          | `class A: def __add__(self, other): return self.x + other.x`               |
| `__sub__`        | Implements subtraction (`-`).                                       | `class A: def __sub__(self, other): return self.x - other.x`               |
| `__mul__`        | Implements multiplication (`*`).                                    | `class A: def __mul__(self, other): return self.x * other.x`               |
| `__truediv__`    | Implements true division (`/`).                                     | `class A: def __truediv__(self, other): return self.x / other.x`           |
| `__floordiv__`   | Implements floor division (`//`).                                   | `class A: def __floordiv__(self, other): return self.x // other.x`         |
| `__mod__`        | Implements modulus (`%`).                                           | `class A: def __mod__(self, other): return self.x % other.x`               |
| `__pow__`        | Implements exponentiation (`**`).                                   | `class A: def __pow__(self, other): return self.x ** other.x`              |
| `__and__`        | Implements bitwise AND (`&`).                                       | `class A: def __and__(self, other): return self.x & other.x`               |
| `__or__`         | Implements bitwise OR (`\| `).                                      | `class A: def __or__(self, other): return self.x \| other.x`               |
| `__xor__`        | Implements bitwise XOR (`^`).                                       | `class A: def __xor__(self, other): return self.x ^ other.x`               |
| `__lshift__`     | Implements left shift (`<<`).                                       | `class A: def __lshift__(self, other): return self.x << other.x`           |
| `__rshift__`     | Implements right shift (`>>`).                                      | `class A: def __rshift__(self, other): return self.x >> other.x`           |
| `__invert__`     | Implements bitwise NOT (`~`).                                       | `class A: def __invert__(self): return ~self.x`                            |
| `__bool__`       | Converts the object to a boolean value.                             | `class A: def __bool__(self): return bool(self.x)`                         |
| `__hash__`       | Returns the hash value of the object.                               | `class A: def __hash__(self): return hash(self.x)`                         |
| `__getattr__`    | Handles access to non-existent attributes.                          | `class A: def __getattr__(self, name): return f"No attribute {name}"`      |
| `__setattr__`    | Handles setting of attributes.                                      | `class A: def __setattr__(self, name, value): self.__dict__[name] = value` |
| `__delattr__`    | Handles deletion of attributes.                                     | `class A: def __delattr__(self, name): del self.__dict__[name]`            |
| `__enter__`      | Handles logic for entering a context (used with `with` statements). | `class A: def __enter__(self): return self`                                |
| `__exit__`       | Handles logic for exiting a context (used with `with` statements).  | `class A: def __exit__(self, exc_type, exc_val, exc_tb): return True`      |


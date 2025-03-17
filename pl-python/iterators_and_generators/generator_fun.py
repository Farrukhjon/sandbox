from typing import Iterator


def infinite_ints_gen_fun() -> Iterator:
    num = 0
    while True:
        yield num  # yield statement
        num += 1


g1 = infinite_ints_gen_fun()

for i in range(100):
    val = next(g1)  # Return the next item from the iterator. Python calls .__next__() on the g1 function
    print(val)

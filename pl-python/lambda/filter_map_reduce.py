from functools import reduce

ints = [item for item in range(1, 100 + 1)]
print(ints)

even_lambda = lambda i: i % 2 == 0
even_ints = list(filter(even_lambda, ints))

print(even_ints)

pow_of_2_ints = list(map(lambda i: pow(i, 2), ints))

print(pow_of_2_ints)

summ_of_ints = reduce(lambda acc, i: acc + i, ints)
print(summ_of_ints)

max_of_pow_of_2_ints = reduce(lambda acc, i: acc if acc > i else i, pow_of_2_ints)
print(max_of_pow_of_2_ints)

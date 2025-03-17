def multiple(a, b):
    return a * b

def test_multiple_func_correct():
    result = multiple(2, 2)
    assert 4 == result

def test_multiple_func_incorrect():
    result = multiple(2, 2)
    assert 5 == result


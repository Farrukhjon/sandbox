from collections.abc import dict_keys, dict_values


def test_dict_keys_and_values_types():
    people = {
        1: {
            'first_name': 'Ali',
            'last_name': 'Samiev',
            'full_name': 'Ali Samiev',
            'age': 22,
            'email': 'ali.samivev@emaple.org'
        },
        2: {
            'first_name': 'Vali',
            'last_name': 'Samiev',
            'full_name': 'Vali Samiev',
            'age': 33,
            'email': 'vali.samivev@emaple.org'
        },
        3: {
            'first_name': 'Gani',
            'last_name': 'Halim',
            'full_name': 'Gani Halim',
            'age': 40,
            'email': 'ali.samivev@emaple.org'
        }
    }

    keys = people.keys()
    assert isinstance(keys, dict_keys)
    assert keys == {1, 2, 3}
    values = people.values()
    assert isinstance(values, dict_values)


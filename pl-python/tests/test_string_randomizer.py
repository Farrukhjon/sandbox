from randomizer.str_randomizer import StringRandomizer


class TestStringRandomizer:

    def test_random_string(self):
        randomizer = StringRandomizer()

        str_lst = []
        for _ in range(100):
            rnd_str = randomizer.generate_random_string(128)
            str_lst.append(rnd_str)

        assert all(lambda str_item: str_item == str_lst[0], str_lst)

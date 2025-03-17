from random import  Random


class TestRandom:

    def test_random_choice(self):

        rnd = Random(100)

        print(rnd.choice([63, 64, 72, 75]))
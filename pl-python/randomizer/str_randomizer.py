import random
import string


class StringRandomizer:

    def __init__(self, seed: int | float | str | bytes | bytearray | None = None):
        """
        Provides methods to generates random string with the given size (length) in ASCII letters.
        :param seed: optional seed to create predictable sequences of the pseud-random string.
        """
        self._seed = seed

    def generate_random_string(self, size: int) -> str:
        """
        Generates random string with the given size (length) in ASCII letters.
        :param size: size of the random string.
        :return: pseudo-random string.
        """
        letters_and_digits = string.ascii_letters + string.digits
        random.seed(self._seed)
        list_of_chars = random.choices(population=letters_and_digits, k=size)
        return "".join(list_of_chars)

    def generate_random_string_in_bytes(self, size: int) -> bytes:
        """
        Generates random string with the given size (length) in ASCII letters and encoded in bytes.
        :param size: size of the random string.
        :return: pseudo-random string in bytes.
        """
        return self.generate_random_string(size).encode()

    @property
    def seed(self):
        return self._seed

    @seed.setter
    def seed(self, seed):
        self._seed = seed
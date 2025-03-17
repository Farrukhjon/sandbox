class Counter:
    def __init__(self) -> None:
        pass

    def show_count(self, count: int, word: str):
        if count == 1:
            return f'1 {word}'
        count_str = str(count) if count else 'no'
        return f'{count_str} {word}s'

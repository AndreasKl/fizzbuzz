from typing import Generator, NamedTuple


class Value(NamedTuple):
    id: int
    value: str


def generate(start: int, end: int) -> Generator[Value]:
    for i in range(start, end + 1):
        value = ""
        if i % 3 == 0:
            value += "Fizz"
        if i % 5 == 0:
            value += "Buzz"
        yield Value(id=i, value=value)

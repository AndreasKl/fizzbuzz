import unittest

from fizzbuzz.generator import generate, Value


class TestFizzBuzz(unittest.TestCase):
    def test_generate_full_range(self):
        result = list(generate(1, 16))
        self.assertListEqual(
            result,
            [
                Value(1, ""),
                Value(2, ""),
                Value(3, "Fizz"),
                Value(4, ""),
                Value(5, "Buzz"),
                Value(6, "Fizz"),
                Value(7, ""),
                Value(8, ""),
                Value(9, "Fizz"),
                Value(10, "Buzz"),
                Value(11, ""),
                Value(12, "Fizz"),
                Value(13, ""),
                Value(14, ""),
                Value(15, "FizzBuzz"),
                Value(16, ""),
            ],
        )

    def test_generate_high_range(self):
        result = list(generate(765, 774))
        self.assertListEqual(
            [
                Value(id=765, value="FizzBuzz"),
                Value(id=766, value=""),
                Value(id=767, value=""),
                Value(id=768, value="Fizz"),
                Value(id=769, value=""),
                Value(id=770, value="Buzz"),
                Value(id=771, value="Fizz"),
                Value(id=772, value=""),
                Value(id=773, value=""),
                Value(id=774, value="Fizz"),
            ],
            result,
        )

using static fizzbuzz.FizzBuzz;

namespace fizzbuzz.test;

public class FizzBuzzTest
{
    [Fact]
    public void GenerateFizzesVeryBuzzy()
    {
        var fizzesAndBuzzes = Generate(1, 16).ToList();
        Assert.Equivalent(
            new List<Item>
            {
                new(1, ""),
                new(2, ""),
                new(3, "Fizz"),
                new(4, ""),
                new(5, "Buzz"),
                new(6, "Fizz"),
                new(7, ""),
                new(8, ""),
                new(9, "Fizz"),
                new(10, "Buzz"),
                new(11, ""),
                new(12, "Fizz"),
                new(13, ""),
                new(14, ""),
                new(15, "FizzBuzz"),
                new(16, ""),
            },
            fizzesAndBuzzes
        );
    }
}

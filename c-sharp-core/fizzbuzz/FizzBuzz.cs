using System.Collections.Immutable;

namespace fizzbuzz;

public static class FizzBuzz
{
    public record Item(int Index, string Value);

    public static IEnumerable<Item> Generate(int min, int max)
    {
        var range = Enumerable.Range(min, max);
        foreach (var index in range)
        {
            var value = "";
            if (index % 3 == 0)
            {
                value += "Fizz";
            }
            if (index % 5 == 0)
            {
                value += "Buzz";
            }
            yield return new Item(Index: index, Value: value);
        }
    }
}

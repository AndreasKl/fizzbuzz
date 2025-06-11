using System.Globalization;
using fizzbuzz;

if (args.Length != 2)
{
    Console.WriteLine("Please pass two numbers (min and max) as params.");
    return;
}

var min = int.Parse(args[0], CultureInfo.InvariantCulture);
var max = int.Parse(args[1], CultureInfo.InvariantCulture);

foreach (var token in FizzBuzz.Generate(min, max))
{
    Console.WriteLine($"{token}");
}

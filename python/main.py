from fizzbuzz.generator import generate
import argparse

if __name__ == "__main__":
    parser = argparse.ArgumentParser("fizzbuzz")
    parser.add_argument("-min", type=int, default=1)
    parser.add_argument("-max", type=int, default=20)
    args = parser.parse_args()

    for value in generate(args.min, args.max):
        print(value)

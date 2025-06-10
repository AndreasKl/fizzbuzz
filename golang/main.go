package main

import (
	"fmt"
	"os"
	"strconv"
)

type Value struct {
	Id    int
	Value string
}

func Generate(min int, max int) []Value {
	collector := []Value{}
	for index := min; index <= max; index++ {
		value := ""
		if index%3 == 0 {
			value += "Fizz"
		}
		if index%5 == 0 {
			value += "Buzz"
		}
		collector = append(collector, Value{Id: index, Value: value})
	}
	return collector
}

func main() {
	args := os.Args[1:]
	if len(args) != 2 {
		fmt.Printf("Please provide two numbers as min and max arguments to the command.")
		os.Exit(1)
	}
	min, err := strconv.Atoi(args[0])
	if err != nil {
		fmt.Printf("The first argument is not a number.")
		os.Exit(2)
	}
	max, err := strconv.Atoi(args[1])
	if err != nil {
		fmt.Printf("The second argument is not a number.")
		os.Exit(3)
	}

	fizzbuzz := Generate(min, max)
	for _, value := range fizzbuzz {
		fmt.Printf("Index: %d Value: %s\n", value.Id, value.Value)
	}
}

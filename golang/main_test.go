package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestGenerate(t *testing.T) {
	values := Generate(1, 16)

	expected := []Value{
		{Id: 1},
		{Id: 2},
		{Id: 3, Value: "Fizz"},
		{Id: 4},
		{Id: 5, Value: "Buzz"},
		{Id: 6, Value: "Fizz"},
		{Id: 7},
		{Id: 8},
		{Id: 9, Value: "Fizz"},
		{Id: 10, Value: "Buzz"},
		{Id: 11},
		{Id: 12, Value: "Fizz"},
		{Id: 13},
		{Id: 14},
		{Id: 15, Value: "FizzBuzz"},
		{Id: 16},
	}
	assert.Equal(t, expected, values)
}

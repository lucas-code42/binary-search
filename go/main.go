package main

import (
	"fmt"
)

func binarySearch(list []int, item int) int {
	lowest := 0
	higher := len(list) - 1

	for lowest <= higher {
		mid := (lowest + higher) / 2
		guess := list[mid]

		if item == guess {
			return mid
		}

		if guess < item {
			lowest = mid + 1
		} else {
			higher = mid - 1
		}
	}

	return 0
}

func main() {
	n := []int{1, 5, 7, 27, 45, 66, 67, 855, 955}
	fmt.Println(binarySearch(n, 67))
}

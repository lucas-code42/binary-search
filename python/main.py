def binary_search(array: list, target: int) -> int:
    lowest = 0
    higher = len(array) - 1

    while lowest <= higher:
        mid = (lowest + higher) // 2
        guess = array[mid]

        if target == guess:
            return mid

        if target < guess:
            higher = mid - 1
        else:
            lowest = mid + 1

    return 0


if __name__ == "__main__":
    print(binary_search([10, 30, 48, 58, 60, 99, 129], 48))

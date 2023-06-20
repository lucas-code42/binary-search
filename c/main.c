#include <stdio.h>
#include <stdlib.h>

int binarySearch(int array[], int item, int size)
{

    int lowest = 0;
    int higher = size - 1;

    while (lowest <= higher)
    {
        int mid = (lowest + higher) / 2;
        int guess = array[mid];

        if (item == guess)
        {
            return mid;
        }

        if (guess < item)
        {
            lowest = mid + 1;
        }
        else
        {
            higher = mid - 1;
        }
    }

    return 0;
}

int main()
{
    int n[] = {9, 20, 33, 44, 55, 100, 299};

    int size = sizeof(n) / sizeof(n[0]);
    printf("%d\n", binarySearch(n, 55, size));

    return 0;
}

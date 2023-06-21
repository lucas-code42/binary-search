fn binary_search(array: Vec<i32>, item: i32) -> usize {
    let mut low: usize = 0;
    let mut higher: usize = array.len();

    while low <= higher {
        let mid: usize = (low + higher) / 2;
        let guess = array[mid];

        if guess == item {
            return mid;
        }

        if guess < item {
            low = mid + 1;
        } else {
            higher = mid - 1;
        }
    }

    return 0;
}

fn main() {
    let n: Vec<i32> = vec![1, 3, 4, 6, 78, 98, 1000, 2000, 12985];
    print!("{}\n", binary_search(n.clone(), 2000));
}

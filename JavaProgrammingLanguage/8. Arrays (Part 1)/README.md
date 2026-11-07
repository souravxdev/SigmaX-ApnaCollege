# Arrays (Part 1) in Java — Quick Notes

## 1. What is an Array?

A list of values of the **same type**, stored next to each other in memory (contiguous). Each value has an **index**, starting at `0`, so the last index is `length - 1`.

```java
int numbers[] = { 2, 4, 6, 8 };
// index:         0  1  2  3
```

## 2. Creating an Array

```java
int marks[] = new int[100]; // dataType arrayName[] = new dataType[size];

int numbers[] = { 97, 98, 99 }; // declare and fill in one step
```

- The size is fixed when the array is created and cannot change later.
- `new` fills every slot with a default value.

| Type               | Default value |
| ------------------ | ------------- |
| `int`, `long`      | `0`           |
| `float`, `double`  | `0.0`         |
| `boolean`          | `false`       |
| `String` / objects | `null`        |

## 3. Input, Output and Update

Use the index inside `[ ]` to read or write one element.

```java
marks[0] = scanner.nextInt(); // input

System.out.println(marks[0]); // output

marks[2] = marks[2] + 1; // update
```

`marks.length` gives the size. It is a **field, not a method**, so there are no brackets.

```java
for (int i = 0; i < marks.length; i++) {
  System.out.print(marks[i] + " ");
}
```

Using an index outside `0` to `length - 1` throws `ArrayIndexOutOfBoundsException`.

## 4. Passing an Array to a Method

The method receives the **same** array, not a copy, so changes made inside the method are visible in `main`. (Compare with `int` parameters, which are copied: see Call by Value in Functions & Methods.)

```java
public static void update(int[] marks) {
  for (int i = 0; i < marks.length; i++) {
    marks[i] = marks[i] + 1;
  }
}

int marks[] = { 97, 98, 99 };

update(marks); // marks is now { 98, 99, 100 }
```

This is why `update()` and `reverse()` can return `void` and still change the array.

## 5. Linear Search — O(n)

Check every element one by one. Works on **any** array, sorted or not. Return `-1` to mean "not found".

```java
public static int linearSearch(int[] numbers, int key) {
  for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == key) {
      return i;
    }
  }
  return -1;
}
```

## 6. Largest / Smallest Element

Start from the opposite extreme so the first real element always replaces it.

```java
int largest = Integer.MIN_VALUE; // acts like -infinity

for (int i = 0; i < numbers.length; i++) {
  if (numbers[i] > largest) {
    largest = numbers[i];
  }
}
```

For the smallest, start with `Integer.MAX_VALUE` (acts like +infinity) and use `<`.

## 7. Binary Search — O(log n)

Works only on a **sorted** array. Compare with the middle element and throw away the half that cannot contain the key.

```java
int start = 0;

int end = numbers.length - 1;

while (start <= end) {
  int mid = (start + end) / 2;

  if (numbers[mid] == key) {
    return mid; // found
  } else if (numbers[mid] > key) {
    end = mid - 1; // search left half
  } else {
    start = mid + 1; // search right half
  }
}

return -1; // not found
```

- Use `start <= end`, so a range of one element is still checked.
- Always move to `mid - 1` or `mid + 1`, otherwise the loop can run forever.

## 8. Reverse an Array (Two Pointers)

One pointer at each end. Swap, then move both towards the middle.

```java
int first = 0;

int last = numbers.length - 1;

while (first < last) {
  int temp = numbers[last];
  numbers[last] = numbers[first];
  numbers[first] = temp;
  first++;
  last--;
}
```

A `temp` variable is needed for the swap; assigning directly would lose one of the values.

## 9. Pairs in an Array — O(n²)

The inner loop starts at `i + 1`, so `(2,4)` is printed but not `(2,2)` or `(4,2)`.

```java
for (int i = 0; i < numbers.length; i++) {
  for (int j = i + 1; j < numbers.length; j++) {
    System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
  }
  System.out.println();
}
```

```
(2,4) (2,5) (2,10)
(4,5) (4,10)
(5,10)
```

Total pairs for `n` elements = `n * (n - 1) / 2`.

## 10. Subarrays — O(n³)

A subarray is a **continuous** part of the array. `i` is the start, `j` is the end, and `k` prints everything from start to end.

```java
for (int i = 0; i < numbers.length; i++) {
  for (int j = i; j < numbers.length; j++) {
    for (int k = i; k <= j; k++) {
      System.out.print(numbers[k] + " ");
    }
    System.out.println();
  }
}
```

Total subarrays for `n` elements = `n * (n + 1) / 2`.

## 11. Time Complexity Cheat Sheet

Time complexity follows the loops: one loop over `n` is O(n), each nested loop multiplies by `n`.

| Program          | Loops                      | Time complexity |
| ---------------- | -------------------------- | --------------- |
| Linear search    | 1 loop                     | O(n)            |
| Largest/smallest | 1 loop                     | O(n)            |
| Reverse          | 1 loop (half the array)    | O(n)            |
| Binary search    | halves the range each time | O(log n)        |
| Pairs            | 2 nested loops             | O(n²)           |
| Subarrays        | 3 nested loops             | O(n³)           |

## Key Takeaways

1. **`length` has no brackets:** `numbers.length` for arrays, `str.length()` for strings.
2. **Loop with `<`, not `<=`:** `i <= numbers.length` goes one past the last index and crashes.
3. **Binary search needs sorted input:** on an unsorted array it gives a wrong answer without any error.
4. **Average with integers drops decimals:** `(a + b + c) / 3` is integer division; divide by `3.0` for a decimal result.
5. **`System.out`, not `System.err`:** `System.err` prints to the error stream, so the output can appear red or out of order.

## File Sequence

1. Array.java — create, input, output, update and `length`
2. PassingArrayAsArgument.java — changes inside a method affect the original array
3. FindElementOfArray.java — linear search
4. LargestNumberInArray.java — `Integer.MIN_VALUE` as the starting point
5. SmallestNumberInArray.java — `Integer.MAX_VALUE` as the starting point
6. BinarySearch.java — search a sorted array by halving
7. ReverseAnArray.java — two pointers and swap
8. PairsInAnArray.java — nested loops, inner loop from `i + 1`
9. SubArraysInAnArray.java — three nested loops for every continuous part

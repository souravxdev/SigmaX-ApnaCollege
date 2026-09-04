# Arrays (Part 1) — Quick Notes

## 1. What an Array Is

A single variable holding many values of the **same type**, stored side by side.
Index starts at **0**, so last index is `length - 1`.

## 2. Creating an Array

```java
int marks[] = new int[100];        // size fixed at creation, filled with 0
int marks[] = { 97, 98, 99 };      // declare + initialise together
```

Defaults: `int/long` → `0`, `float/double` → `0.0`, `boolean` → `false`, `String`/objects → `null`.

Size cannot change later. `marks.length` is a **field, not a method** — no `()`.

## 3. Read / Write / Loop

```java
marks[0] = sc.nextInt();           // write
System.out.println(marks[0]);      // read
marks[2] = marks[2] + 1;           // update

for (int i = 0; i < marks.length; i++) {
    System.out.print(marks[i] + " ");
}
```

Going outside `0 .. length-1` throws `ArrayIndexOutOfBoundsException`.

## 4. Arrays Are Passed by Reference

The method gets the **same** array, not a copy — changes inside are visible outside.

```java
public static void update(int marks[]) {
    for (int i = 0; i < marks.length; i++) marks[i] = marks[i] + 1;
}
update(marks);                     // original array is now changed
```

This is why `reverse()` and `update()` return `void` but still work.

## 5. Linear Search — O(n)

Works on **any** array (sorted or not). Return `-1` to mean "not found".

```java
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == key) return i;
}
return -1;
```

## 6. Binary Search — O(log n)

Only for a **sorted** array. Keep halving the search range.

```java
int start = 0, end = numbers.length - 1;
while (start <= end) {
    int mid = (start + end) / 2;
    if (numbers[mid] == key) return mid;
    else if (numbers[mid] > key) end = mid - 1;    // key is in left half
    else start = mid + 1;                          // key is in right half
}
return -1;
```

Remember: `<=` in the while (a 1-element range must still be checked), and always move `mid ± 1` or it loops forever.

## 7. Largest / Smallest

Start from the opposite extreme so the first real element always wins.

```java
int largest  = Integer.MIN_VALUE;   // then if (numbers[i] > largest)
int smallest = Integer.MAX_VALUE;   // then if (numbers[i] < smallest)
```

## 8. Reverse an Array — Two Pointers

Swap from both ends and move inward.

```java
int first = 0, last = numbers.length - 1;
while (first < last) {
    int temp = numbers[last];
    numbers[last] = numbers[first];
    numbers[first] = temp;
    first++; last--;
}
```

A temp variable is needed — assigning directly loses one value.

## 9. Pairs — O(n²)

Inner loop starts at `i + 1` so `(a,b)` is printed but not `(a,a)` or `(b,a)`.

```java
for (int i = 0; i < n; i++)
    for (int j = i + 1; j < n; j++)
        System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
```

Total pairs for n elements = `n * (n - 1) / 2`.

## 10. Subarrays — O(n³)

A subarray is a **continuous** part of the array. `i` = start, `j` = end, `k` prints from start to end.

```java
for (int i = 0; i < n; i++)
    for (int j = i; j < n; j++)
        for (int k = i; k <= j; k++)
            System.out.print(numbers[k] + " ");
```

Total subarrays = `n * (n + 1) / 2`.

## 11. Common Mistakes

- `marks.length()` → wrong, `length` has no brackets (that is for `String`).
- Looping with `i <= numbers.length` → out of bounds.
- Binary search on an unsorted array → wrong answer, no error.
- `int average = (a + b + c) / 3;` → int division, decimals lost.
- `System.err.println()` instead of `System.out` — prints to error stream (shows red / out of order).

---

## File Sequence

**Concepts:** Array → PassingArrayAsArgument → FindElementOfArray → LargestNumberInArray → SmallestNumberInArray → BinarySearch → ReverseAnArray → PairsInAnArray → SubArraysInAnArray

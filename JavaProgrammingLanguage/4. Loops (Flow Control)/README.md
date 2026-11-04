# Loops (Flow Control) in Java — Quick Notes

## 1. `while` Loop

Checks the condition **first**, then runs the body. If the condition is `false` at the start, the body never runs.

```java
int counter = 1;

while (counter <= 10) {
  System.out.println(counter);
  counter++;
}
```

**Remember:** update the loop variable (`counter++`) inside the body, or the loop never ends.

## 2. `for` Loop

Puts initialisation, condition and update on one line. Best when you know how many times to repeat.

```java
// for (initialisation; condition; update)
for (int i = 1; i <= 10; i++) {
  System.out.println(i);
}
```

Any `while` loop can be written as a `for` loop and vice versa (see `PrintSquarePattern.java`).

## 3. `do-while` Loop

Runs the body **first**, then checks the condition, so it always runs **at least once**.

```java
int counter = 1;

do {
  System.out.println(counter + ". Hello World");
  counter++;
} while (counter <= 10);
```

**Remember:** a `do-while` ends with a semicolon after `while (...)`.

## 4. `break` and `continue`

| Keyword    | What it does                                           |
| ---------- | ------------------------------------------------------ |
| `break`    | Exits the loop immediately                             |
| `continue` | Skips the rest of this iteration and moves to the next |

```java
for (int i = 1; i <= 5; i++) {
  if (i == 3) {
    continue; // prints 1 2 4 5
  }
  System.out.print(i + " ");
}
```

With `break` instead of `continue`, the same loop prints only `1 2`.

## 5. Common Patterns

| Problem              | Technique                                                                 |
| -------------------- | ------------------------------------------------------------------------- |
| Sum of 1 to n        | `sum += i;` inside a loop from `1` to `n`                                 |
| Last digit of number | `number % 10`                                                             |
| Remove last digit    | `number = number / 10;`                                                   |
| Reverse a number     | `reverse = (reverse * 10) + lastDigit;` while `number > 0`                |
| Prime check          | Try divisors `i` while `i * i <= number`, `break` on the first `% i == 0` |
| Factorial            | `factorial *= i;` from `1` to `n`, stored in a `long` to avoid overflow   |
| Repeat until user ok | `do { ... } while (choice == 1);`                                         |
| Infinite input loop  | `while (true)` / `do { ... } while (true);` with `break` to stop          |

## 6. Closing the Scanner in an Infinite Loop

Code after `while (true)` with no `break` is **unreachable**, so `scanner.close();` there will not compile. Use try-with-resources instead, which closes the scanner automatically:

```java
try (Scanner scanner = new Scanner(System.in)) {
  do {
    // read and process input
  } while (true);
}
```

## Key Takeaways (from the practice questions)

1. **Changing the loop variable inside the body changes the count:** with `i += 2;` inside `for (int i = 0; i < 5; i++)`, `i` goes `0 → 3 → 4 → 7 → 8`, so "Hello" prints only **2 times**.
2. **`do-while` suits menus:** read a number, then ask "continue? (1/0)" and loop while `choice == 1`.
3. **Factorial grows fast:** use `long`, and handle negative input separately (factorial is not defined for it).
4. **Multiplication table:** a simple `for (int i = 1; i <= 10; i++)` printing `number * i`.
5. **Variable scope:** a variable declared in the `for (...)` header exists only inside that loop. Declare it before the loop (`int i;`) to use it afterwards.

## File Sequence

1. While.java
2. Print1To10.java
3. Print1ToN.java
4. SumOfFirstNaturalNumbers.java
5. For.java
6. PrintSquarePattern.java
7. PrintReverseNumber.java
8. ReverseGivenNumber.java
9. DoWhile.java
10. BreakOne.java
11. BreakTwo.java — stop input on a multiple of 10
12. ContinueOne.java
13. ContinueTwo.java — skip multiples of 10
14. IsPrime.java
15. PracticeQuestion1.java — how many times "Hello" prints
16. PracticeQuestion2.java — sum of even and odd numbers
17. PracticeQuestion3.java — factorial
18. PracticeQuestion4.java — multiplication table
19. PracticeQuestion5.java — variable scope after a `for` loop

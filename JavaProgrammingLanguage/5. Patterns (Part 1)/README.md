# Patterns (Part 1) in Java — Quick Notes

## 1. Nested Loops

Every pattern uses two loops: the **outer loop** picks the row and the **inner loop** prints what goes on that row. After the inner loop, `System.out.println()` moves to the next line.

```java
for (int row = 1; row <= n; row++) {        // lines
    for (int col = 1; col <= ...; col++) {  // items on this line
        System.out.print(...);
    }
    System.out.println();                    // next line
}
```

**Tip:** to work out a pattern, write down how many items each row has, then turn that into the inner loop's condition.

## 2. Right-Angle Triangle (Stars)

Row `row` has `row` stars.

```java
for (int row = 1; row <= n; row++) {
  for (int star = 1; star <= row; star++) {
    System.out.print("*");
  }
  System.out.println();
}
```

```
*
**
***
****
*****
```

## 3. Inverted Star Triangle

Row `row` has `n - row + 1` stars, so the count shrinks each line.

```java
for (int row = 1; row <= n; row++) {
  for (int star = 1; star <= n - row + 1; star++) {
    System.out.print("*");
  }
  System.out.println();
}
```

```
*****
****
***
**
*
```

## 4. Half Pyramid (Numbers)

Same shape as the right-angle triangle, but prints the inner loop counter instead of a star.

```java
for (int row = 1; row <= n; row++) {
  for (int number = 1; number <= row; number++) {
    System.out.print(number);
  }
  System.out.println();
}
```

```
1
12
123
1234
12345
```

## 5. Character Pattern

Declare the `char` **outside** both loops so it keeps counting across rows. `char ch = 65;` is the same as `char ch = 'A';`, and `ch++` moves to the next letter.

```java
char ch = 'A';

for (int row = 1; row <= n; row++) {
  for (int character = 1; character <= row; character++) {
    System.out.print(ch);
    ch++;
  }
  System.out.println();
}
```

```
A
BC
DEF
GHIJ
KLMNO
```

## 6. Pattern Cheat Sheet

| Pattern              | Items in row `row` | Inner loop prints  |
| -------------------- | ------------------ | ------------------ |
| Right-angle triangle | `row`              | `"*"`              |
| Inverted triangle    | `n - row + 1`      | `"*"`              |
| Half pyramid         | `row`              | inner loop counter |
| Character triangle   | `row`              | `ch++` (A, B, C…)  |

## Key Takeaways

1. **`print` vs `println`:** use `print` inside the inner loop so items stay on one line, and `println()` once after it.
2. **Use `n`, not a fixed number:** writing `4 - row + 1` instead of `n - row + 1` breaks the pattern as soon as `n` changes.
3. **Where you declare a variable matters:** declaring `ch` inside the outer loop would restart every row at `A`.
4. **`char` is a number underneath:** `ch++` works because characters are stored as Unicode values (`'A'` = 65).

## File Sequence

1. RightAngleTriangle.java
2. InvertedStar.java
3. HalfPyramid.java
4. Character.java

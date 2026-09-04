# Operators in Java — Quick Notes

## 1. Arithmetic Operators (`+ - * / %`)

```java
int A = 10, B = 5;
A + B   // 15
A / B   // 2  → integer division: result is truncated, NOT rounded (7 / 2 = 3)
A % B   // 0  → modulo gives the remainder (7 % 2 = 1)
```

**Remember:** With two `int` operands, `/` always drops the decimal part.

## 2. Increment / Decrement (`++` `--`)

| Form | Meaning |
|------|---------|
| `++a` (pre) | increment **first**, then use the value |
| `a++` (post) | use the value **first**, then increment |

```java
int a = 10;
int b = ++a;   // a = 11, b = 11  (pre)

int a = 10;
int b = a++;   // a = 11, b = 10  (post — b got the OLD value)
```

Same rule for `--a` and `a--`.

## 3. Relational Operators (`== != > < >= <=`)

Always return a `boolean`.

```java
int A = 10, B = 10;
A == B   // true
A != B   // false
A <= B   // true
```

**Remember:** `==` compares, `=` assigns. Don't mix them up.

## 4. Logical Operators (`&& || !`)

```java
(3 > 2) && (5 > 0)   // true  → AND: both must be true
(3 > 2) || (5 < 0)   // true  → OR: at least one must be true
!(3 > 2)             // false → NOT: flips the result
```

## 5. Assignment Operators (`= += -= *= /= %=`)

Shorthand: `A += 10` means `A = A + 10`.

```java
int A = 10;  A += 10;  // 20
int C = 32;  C *= 2;   // 64
int E = 4;   E %= 2;   // 0
```

## Key Takeaways (from the practice questions)

1. **Order matters with integer division:**
   `(x * y / x)` → left to right → `2*5/2 = 5`, but `(x * (y / x))` → `2 * (5/2) = 2 * 2 = 4`.
2. **`&&` short-circuits:** if the left side is false, the right side is never checked.
3. **Chained assignment works right to left:** `x = y = z = 2` sets all three to 2.
4. **Precedence:** `()` first, then `* / %`, then `+ -`, evaluated left to right for equal precedence. So `4/3 * 47 = 1 * 47 = 47` (not 62), because `4/3` is `1` in int math.

## File Sequence

1. BinaryArithmaticOperators.java
2. IncrementOperator.java
3. DecrementOperator.java
4. RelationalOperators.java
5. LogicalOperators.java
6. AssignmentOperators.java
7. PracticeQuestion1.java — precedence with integer division
8. PracticeQuestion2.java — `&&` in if conditions
9. PracticeQuestion3.java — chained assignment + compound operators
10. PracticeQuestion4.java — full precedence expression
11. PracticeQuestion5.java — grouping doesn't always change the result

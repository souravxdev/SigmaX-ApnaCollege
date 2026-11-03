# Conditional Statements in Java — Quick Notes

## 1. `if` / `else`

Runs a block only when the condition is `true`; `else` runs otherwise.

```java
int A = 5, B = 10;
if (A > B) {
    System.out.println("A is largest");
} else {
    System.out.println("B is largest");
}
```

**Remember:** an `else` attaches to the **nearest** `if` above it.

## 2. `if` / `else if` / `else`

Checks conditions top to bottom and runs **only the first** one that is `true`.

```java
if (age >= 18) {
    System.out.println("Adult");
} else if (age >= 13 && age < 18) {
    System.out.println("Teenager");
} else {
    System.out.println("Not adult");
}
```

**Separate `if`s vs `else if`:** with two separate `if` blocks, both are checked.
In `IfElse.java`, `age = 20` prints **"Adult"** and **"Not adult"**, because the `else` belongs only to the second `if`. Use `else if` when only one branch should run.

## 3. Ternary Operator (`? :`)

A one-line `if`/`else` that **returns a value**.

```java
// variable = (condition) ? valueIfTrue : valueIfFalse;
String type = (number % 2 == 0) ? "Even" : "Odd";
String reportCard = (marks >= 33) ? "Pass" : "Fail";
```

## 4. `switch`

Matches one variable against fixed values (`case`). `default` runs when nothing matches.

```java
switch (operator) {
    case '+':
        System.out.println(a + b);
        break;
    case '-':
        System.out.println(a - b);
        break;
    default:
        System.out.println("Wrong Operator");
}
```

**Remember:** without `break`, execution **falls through** into the next `case`.

Reading a `char` with Scanner: `char operator = scanner.next().charAt(0);`

## 5. Common Patterns

| Problem | Condition |
|---------|-----------|
| Even / odd | `number % 2 == 0` |
| Largest of 3 | `(A >= B) && (A >= C)`, then `B >= C`, else `C` |
| Income tax slabs | `if` / `else if` ranges, `(int)(income * 0.2)` to drop decimals |
| Leap year | `(year % 4 == 0 && year % 100 != 0) \|\| (year % 400 == 0)` |

## Key Takeaways (from the practice questions)

1. **Zero is neither positive nor negative:** a plain `if (n > 0) ... else` prints "negative" for `0`. Add an `else if (n < 0)` branch to handle it.
2. **Ternary returns any type:** `boolean x = (63 < 36) ? true : false;` gives `x = false`, and `int y = (63 > 36) ? 63 : 36;` gives `y = 63`.
3. **`&&` binds tighter than `||`:** the leap-year check works even without extra brackets, but brackets make it clearer.
4. **Day-of-week with `switch`:** one `case` per value, and `default` catches invalid input (outside 1–7).

## File Sequence

1. IfElse.java
2. PrintLargetsOfTwoNumbers.java
3. OddEven.java
4. IfElseIfElse.java
5. IncomeTaxCalculator.java
6. PrintLargetsOfThreeNumbers.java
7. TernaryOperator.java
8. PassFailTernary.java
9. Switch.java
10. CalculatorSwitchCase.java
11. PracticeQuestion1.java — positive or negative
12. PracticeQuestion2.java — fever check with `if`/`else`
13. PracticeQuestion3.java — day of week using `switch`
14. PracticeQuestion4.java — ternary output (`x`, `y`)
15. PracticeQuestion5.java — leap year

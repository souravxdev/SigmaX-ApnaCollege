# Functions & Methods in Java — Quick Notes

## 1. What is a Function?

A named block of code that does one job. Write it once, call it as many times as you need.

```java
public static void printHelloWorld() {
  // definition
  System.out.println("Hello World!");
  return; // optional for void
}

public static void main(String[] args) {
  printHelloWorld(); // call
}
```

Syntax: `accessModifier static returnType name(parameters) { body }`

- `void` means the function returns nothing.
- In Java, a function inside a class is called a **method**.

## 2. Parameters vs Arguments

```java
public static int calculateSum(int x, int y) {
  // x, y = parameters (formal)
  return x + y;
}

int sum = calculateSum(a, b); // a, b = arguments (actual)
```

The return type must match what you return: `int` here, so `return x + y;` must be an `int`.

## 3. Call by Value

Java **always** passes a copy of the value. Changing a parameter inside the method does not change the original variable.

```java
public static void swap(int x, int y) {
  int temp = x;
  x = y;
  y = temp; // only the copies are swapped
}

int a = 5,
  b = 10;

swap(a, b);
// a is still 5, b is still 10
```

## 4. Functions Calling Functions

A method can call another method. Binomial coefficient reuses `factorial()` three times.

```java
public static int factorial(int n) {
  int fact = 1;
  for (int i = 1; i <= n; i++) {
    fact *= i;
  }
  return fact;
}

public static int binCoef(int n, int r) {
  // nCr = n! / (r! * (n - r)!)
  return factorial(n) / (factorial(r) * factorial(n - r));
}
```

**User-defined** methods are ones you write (`factorial`). **Built-in** methods come with Java (`scanner.nextInt()`, `Math.sqrt()`).

## 5. Function Overloading

Several methods with the **same name** but **different parameters**. Java picks the right one from the call.

```java
public static int sum(int a, int b) {
  return a + b;
}

public static int sum(int a, int b, int c) {
  return a + b + c;
} // different count

public static float sum(float a, float b) {
  return a + b;
} // different type
```

Overloading works on the **number** or **type** of parameters. A different return type alone is **not** enough.

## 6. Prime Check

A prime has exactly two factors: 1 and itself. `return false` as soon as a divisor is found.

```java
public static boolean isPrime(int n) {
  if (n <= 1) return false;
  for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) return false;
  }
  return true;
}
```

**Optimisation:** checking up to `Math.sqrt(n)` instead of `n - 1` is enough. If `n` has a factor bigger than its square root, the matching factor is smaller, so it would already have been found.

**Primes in range:** loop from 2 to `n` and call `isPrime(i)` for each number.

## 7. Binary ↔ Decimal

Both peel off the last digit with `%` and `/` and build the answer with powers.

**Binary → Decimal:** multiply each binary digit by a power of 2.

```java
// 101 -> 1*2^0 + 0*2^1 + 1*2^2 = 5
while (binNum > 0) {
  int lastDigit = binNum % 10;
  decNum += lastDigit * (int) Math.pow(2, pow);
  pow++;
  binNum /= 10;
}
```

**Decimal → Binary:** take remainders of 2 and place them at powers of 10.

```java
// 5 -> remainders 1, 0, 1 -> 101
while (decNum > 0) {
  int remainder = decNum % 2;
  binNum += remainder * (int) Math.pow(10, pow);
  pow++;
  decNum /= 2;
}
```

`Math.pow` returns a `double`, so cast it with `(int)`.

## 8. Scope

Where a variable can be used.

| Scope  | Declared in             | Usable                                     |
| ------ | ----------------------- | ------------------------------------------ |
| Method | a method                | inside that method, after the declaration  |
| Block  | `{ }` (if, loop, block) | inside those braces, after the declaration |
| Class  | the class               | controlled by `public`, `private`, etc.    |

```java
{
  int a = 45;
  System.out.println(a); // OK
}

System.out.println(a); // ERROR — a is out of scope
```

## 9. Math Class Methods

No import needed (`java.lang`). All are static: call them as `Math.name(...)`.

| Method           | Returns            | Example                  |
| ---------------- | ------------------ | ------------------------ |
| `Math.min(a, b)` | smaller value      | `Math.min(5, 9)` → `5`   |
| `Math.max(a, b)` | larger value       | `Math.max(5, 9)` → `9`   |
| `Math.sqrt(x)`   | square root        | `Math.sqrt(25)` → `5.0`  |
| `Math.pow(b, e)` | `b` to the power e | `Math.pow(2, 3)` → `8.0` |
| `Math.abs(x)`    | absolute value     | `Math.abs(-7)` → `7`     |

`Math.avg()` does **not** exist. Use `(a + b) / 2.0`.

## Key Takeaways

1. **Return a comparison directly:** `return original == reverse;` already gives `true` or `false`, so no `if` is needed.
2. **`return` stops the method:** in `isPrime`, `return false` exits as soon as a divisor is found.
3. **Divide by a decimal for averages:** `(a + b) / 2` drops the decimal for `int`s; use `2.0`.
4. **`if (result)` is enough:** `if (result == true)` works, but `result` is already a `boolean`.
5. **Watch overflow:** `int` factorial goes wrong after `12!`. Use `long` for bigger values.

## File Sequence

1. Function.java
2. SumOfAB.java — parameters vs arguments, return values
3. CallByValue.java
4. ProductOfAB.java
5. FactorialOfN.java
6. BinomialCoefficient.java — a method calling another method
7. FunctionOverloadingParameters.java — overloading by number of parameters
8. FunctionOverloadingDataType.java — overloading by type of parameters
9. IsPrime.java
10. IsPrimeOptimized.java — loop only up to `Math.sqrt(n)`
11. PrimesInRange.java
12. BinaryToDecimal.java
13. DecimalToBinary.java
14. Scope.java
15. PracticeQuestion1.java — average of three numbers
16. PracticeQuestion2.java — `isEven` method
17. PracticeQuestion3.java — palindrome number
18. PracticeQuestion4.java — `Math` class methods
19. PracticeQuestion5.java — sum of digits

# Variables & Data Types — Quick Notes

## 1. Output

```java
System.out.print("Hi");     // stays on same line
System.out.println("Hi");   // moves to next line
System.out.print("Hi\n");   // same as println
```

## 2. Variables

A named box that holds a value. Value can change, type cannot.

```java
int a = 10;
String name = "Tony Stark";
a = 50;                     // allowed
```

Naming: can start with a letter, `_` or `$`. So `int $ = 24;` is **valid**.

## 3. Primitive Data Types (8)

| Type      | Size | Example              |
| --------- | ---- | -------------------- |
| `byte`    | 1 B  | `byte b = 8;`        |
| `short`   | 2 B  | `short s = 240;`     |
| `int`     | 4 B  | `int n = 25;`        |
| `long`    | 8 B  | `long l = 25L;`      |
| `float`   | 4 B  | `float f = 3.14f;`   |
| `double`  | 8 B  | `double d = 10.5;`   |
| `char`    | 2 B  | `char c = 'a';`      |
| `boolean` | 1 B  | `boolean ok = true;` |

Remember: `float` and `long` literals need the `f` / `L` suffix.
`String` is **not** primitive — it is a class.

## 4. Input — Scanner

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
String word = sc.next();       // one word (stops at space)
String line = sc.nextLine();   // full line (keeps spaces)
int n      = sc.nextInt();
float p    = sc.nextFloat();
boolean b  = sc.nextBoolean();
```

## 5. Type Conversion (automatic / widening)

Small type → big type happens on its own.

```java
int a = 25;
long b = a;      // OK  int -> long
```

Order: `byte → short → int → long → float → double`

## 6. Type Casting (manual / narrowing)

Big type → small type must be forced, and **data can be lost**.

```java
long a = 25;
int  b = a;             // ERROR
int  b = (int) a;       // OK

float x = 25.12f;
int   y = (int) x;      // 25  (decimal part dropped)
```

## 7. char ↔ int (ASCII)

`char` is stored as a number, so it converts to `int` automatically.

```java
char ch = 'a';
int  n  = ch;              // 97   ('b' = 98, 'A' = 65)
System.out.println('b' - 'a');   // 1
```

## 8. Type Promotion in Expressions

**Rule: the result takes the biggest type present in the expression.**

```java
int a = 10; float b = 20.25f; long c = 25; double d = 30;
double answer = a + b + c + d;      // double is the largest -> double
```

Also: `byte`, `short` and `char` are always promoted to `int` before any operation.

```java
short a = 5; byte b = 25; char c = 'c';
byte bt = a + b + c;            // ERROR — result is int
byte bt = (byte)(a + b + c);    // OK
```

Practice Q4:

```java
double result = (f * b) + (i % c) - (d * s);   // double = highest container
```

## 9. Common Mistakes

```java
int a = 10, b = 5, c = 6;
double avg = (a + b + c) / 3;    // 7.0 — int division, decimal lost!
double avg = (a + b + c) / 3.0;  // 7.0 correct way
```

---

## File Sequence

**Concepts:** JavaBasics → JavaBasicsPattern → JavaVariable → JavaPrimitiveDataType → JavaInput → SumOfTwoNumbers → ProductOfTwoNumbers → AreaOfCircle → JavaTypeConversion → JavaTypeCasting → CharacterToIntTypeCast → TypePromotion → TypePromotion2 → TypePromotion3

**Practice:** PracticeQuestion1 → PracticeQuestion5

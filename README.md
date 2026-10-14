# Shape Hierarchy - Area and Perimeter Calculator

A Java demonstration of Object-Oriented Programming (OOP) principles including abstraction, inheritance, polymorphism, and method overriding.

## 📋 Features

- **[Shape](Main.java#L1-L4)**: Abstract base class defining common geometric contracts.
- **[Circle](Main.java#L6-L22)**: Computes area ($\pi r^2$) and circumference ($2 \pi r$).
- **[Rectangle](Main.java#L24-L40)**: Computes area ($l \times w$) and perimeter ($2(l + w)$).
- **[Triangle](Main.java#L42-L60)**: Computes perimeter ($a + b + c$) and area using Heron's formula:
  $$\text{Area} = \sqrt{s(s - a)(s - b)(s - c)} \quad \text{where } s = \frac{a + b + c}{2}$$
- **[Main](Main.java#L62-L77)**: Demonstration runner printing formatted results.

---

## 🛠️ Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- Terminal / Command Prompt / PowerShell

---

## 🚀 How to Run

1. **Clone or navigate** to the project folder:
   ```bash
   cd "path/to/java intership"
   ```

2. **Compile** the program:
   ```bash
   javac Main.java
   ```

3. **Run** the application:
   ```bash
   java Main
   ```

---

## 📊 Sample Output

```text
Circle Area: 78.54
Circle Perimeter: 31.42

Rectangle Area: 24.00
Rectangle Perimeter: 20.00

Triangle Area: 6.00
Triangle Perimeter: 12.00
```

---

## 📁 Project Structure

```text
java intership/
├── Main.java     # Contains Shape, Circle, Rectangle, Triangle, and Main classes
└── README.md     # Project documentation
```

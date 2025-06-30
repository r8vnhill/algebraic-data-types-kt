# 📦 Algebraic Data Types in Kotlin

![Kotlin](https://img.shields.io/badge/kotlin-2.2.0-7F52FF?logo=kotlin)
![Gradle](https://img.shields.io/badge/build%20tool-gradle-02303A?logo=gradle)
![License](https://img.shields.io/badge/license-BSD--2--Clause-blue.svg)
![Platform](https://img.shields.io/badge/platform-JVM-orange)
![Status](https://img.shields.io/badge/status-educational-lightgrey)

This repository accompanies the lessons on algebraic data types from the **DIBS** course (Design and Implementation of Software Libraries).

It includes runnable Kotlin examples demonstrating how to model both **product types** (with `data class`) and **sum types** (with `enum class`) in idiomatic and safe ways.

>[!note]
> The lessons are in Spanish, but the code examples and project structure are in English.

## 🧑‍💻 Getting Started

### Requirements

- Java 11 or newer
- [Gradle](https://gradle.org/) (optional, a wrapper is included)
- An IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) is recommended

### Clone the repository

```bash
git clone https://github.com/r8vnhill/algebraic-data-types-kt.git
cd algebraic-data-types-kt
```

## ✨ What You’ll Learn

This repository contains practical examples for:

### 🧩 Product Types with `data class`

* ✅ Idiomatic data modeling using `data class`
* 🧪 Destructuring instances for readable iteration and filtering
* ♻️ Immutable updates via `copy`
* 🔄 Controlled mutability when needed
* 📦 Choosing between `data class`, regular `class`, and tuples (`Pair`, `Triple`)
* 🧠 Including derived properties and helper functions
* 🏗️ Using secondary constructors and default parameters
* 🧰 Domain modeling with internal validation
* 📁 Practical exercise: managing internal dependency metadata

### ➕ Sum Types with `enum class`

* 🔢 Modeling sum types as closed sets of alternatives
* 🧱 Representing finite states, modes, or outcomes (e.g., `CONNECTED`, `DISCONNECTED`, `IN_PROGRESS`)
* ✅ Compile-time safety with `when` exhaustiveness checking
* 🧭 Avoiding fragile code based on strings or magic constants
* 🆕 Improved syntax with context-sensitive resolution (Kotlin 2.2+)

## 🧠 Background

Algebraic data types (ADTs) are central to type-safe, maintainable library design. Kotlin provides two powerful constructs to model them:

* `data class` for **product types** – grouping multiple values together with structure and semantics.
* `enum class` for **sum types** – representing a fixed set of mutually exclusive alternatives.

These constructs enable readable, expressive, and compiler-verified code, especially when modeling domain-specific types.

## 📘 Related Lessons

Explore the full lessons on the DIBS course site:

* 📄 [Product types with `data class`](https://dibs.ravenhill.cl/docs/type-fundamentals/algebraic-data-types/records-2/kt/)
* 📄 [Sum types with `enum class`](https://dibs.ravenhill.cl/docs/type-fundamentals/algebraic-data-types/enums/kt/)

Each lesson includes motivation, idiomatic use cases, and annotated code examples designed to help you apply ADTs in real Kotlin libraries.

## 🤝 Contributing

This repository is primarily educational and not actively maintained as a collaborative project.  
However, if you spot a mistake, want to suggest an improvement, or have a question:

- Feel free to [open an issue](https://github.com/r8vnhill/algebraic-data-types-kt/issues).
- Please review our [Code of Conduct](CODE_OF_CONDUCT.md) to ensure a respectful and inclusive space.

You're also welcome to fork the project and adapt it for your own learning or teaching purposes!

## 🛠 License

This project is licensed under the [BSD 2-Clause License](LICENSE).

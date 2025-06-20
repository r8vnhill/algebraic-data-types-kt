# 📦 Algebraic Data Types in Kotlin

This repository accompanies the [lesson on idiomatic use of data classes](https://dibs.ravenhill.cl/docs/type-fundamentals/algebraic-data-types/records-2/kt/) from the **DIBS** course (Design and Implementation of Software Libraries).

It includes runnable Kotlin examples that demonstrate how to use `data class` to model **product types**—composite types that group multiple values with meaningful structure and semantics.

>[!note]
> Lesson is in spanish, but the code examples are in English.

---

## ✨ What You’ll Learn

This repository contains practical examples for:

- ✅ Idiomatic data modeling with `data class`
- 🧪 Destructuring instances for readable iteration and filtering
- ♻️ Immutable updates using `copy`
- 🔄 Controlled mutability when needed
- 🧩 Choosing between `data class`, regular `class`, and tuples (`Pair`, `Triple`)
- 🧠 Including derived properties and helper functions
- 🏗️ Using secondary constructors and default parameters
- 🧰 Modeling domain-specific types with internal validation
- 📁 Practical exercise: managing internal dependency metadata

---

## 🧠 Background

`data class` in Kotlin provides an idiomatic way to represent structured, immutable data. By default, the compiler generates:

- `equals()` and `hashCode()` based on primary constructor properties
- `toString()` for readable output
- `copy()` for shallow cloning with modifications
- `componentN()` functions for destructuring

These features make `data class` ideal for modeling product types in reusable, predictable libraries.

---

## 📘 Related Lesson

For detailed explanations and annotated examples, visit the full lesson on the [DIBS course site](https://dibs.ravenhill.cl/docs/type-fundamentals/algebraic-data-types/records-2/kt/).

---

## 🛠 License

This repository is provided for educational purposes as part of the DIBS course. Feel free to fork or adapt the code for personal or academic use.

---

## 💬 Questions or Feedback?

If you found an issue or want to suggest improvements to the lesson or examples, feel free to [open an issue](https://github.com/r8vnhill/algebraic-data-types-kt/issues).

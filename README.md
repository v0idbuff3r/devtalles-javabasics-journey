# DevTalles Java Basics Journey

<div align="center">

Course-following repository for **"Java: Explora el lenguaje desde cero"** (DevTalles) by **Gabriel Chaldu**.  
Code + minimal documentation to keep **learning evidence** organized.

[Course](https://cursos.devtalles.com/courses/Java?coupon=learn-01) ·
[Labs (practice)](https://github.com/v0idbuff3r/java-core-lab) ·
[Progress](#progress) ·
[Structure](#repository-structure) ·
[Workflow](#learning-evidence-workflow-gitgithub)

<img alt="Java" src="https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white" />
<img alt="Type" src="https://img.shields.io/badge/repo-course--following-2ea44f" />
<img alt="Last commit" src="https://img.shields.io/github/last-commit/v0idbuff3r/devtalles-javabasics-journey" />
<img alt="Stars" src="https://img.shields.io/github/stars/v0idbuff3r/devtalles-javabasics-journey?style=flat" />
<img alt="Issues" src="https://img.shields.io/github/issues/v0idbuff3r/devtalles-javabasics-journey?style=flat" />
<img alt="License" src="https://img.shields.io/badge/license-TBD-lightgrey" />

</div>

<!-- Optional banner (recommended):
Place image at: docs/assets/banner.png
Then uncomment:

<p align="center">
  <img src="docs/assets/banner.png" alt="banner" width="900" />
</p>
-->
<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=24&pause=1000&center=true&vCenter=true&width=700&lines=DevTalles+Java+Basics+Journey;Course-following+repo;Practice+goes+to+java-core-lab" />
</p>

---

## Overview

This repository contains:
- course lesson code (instructor-aligned examples when useful)
- my implementation/interpretation of the same concepts
- minimal `.md` notes only when they add value

**Extra practice (katas/challenges/mini-projects) lives here:**  
- Labs repo: https://github.com/v0idbuff3r/java-core-lab

---

## What this repo is (and is not)

### Includes
- lesson-following code (runnable examples)
- section projects required by the course
- small local notes near the code (optional)

### Excludes
- large independent exercise collections
- katas/challenges libraries
- integrator/global projects

Rule of thumb:
- **Course repo** = follow course + keep evidence
- **Labs repo** = repetition + variations + deeper practice

---

## Course info

- Title: Java: Explora el lenguaje desde cero
- Instructor: Gabriel Chaldu
- Platform: DevTalles / Udemy
- Target: build strong Java fundamentals baseline

---

## Repository structure

<details>
<summary><strong>Tree (high level)</strong></summary>

```text
.
├── src/
│   ├── s03languagefundamentals/
│   │   ├── s03lessons/
│   │   └── s03sectionproject/
│   ├── s04classesandobjects/
│   │   ├── s04lessons/
│   │   └── s04sectionproject/
│   ├── s05oop/
│   ├── s06collections/
│   ├── s07exceptions/
│   ├── s08json/
│   ├── s09mvc/
│   └── s10lombok/
└── README.md
````

</details>

### Naming rules (lightweight)

* `sXX.../` = course sections/modules
* `...lessons/` = lesson code examples
* `...sectionproject/` = section projects required by the course
* `ref.../` (optional) = instructor reference/baseline comparison

---

## Quick start

### Option A: IDE (recommended)

Open the project in your IDE and run the desired `main()` class.

### Option B: CLI (single file)

```bash
# Example (adjust paths):
javac src/s03languagefundamentals/s03lessons/PrimitiveVariables.java
java -cp src s03languagefundamentals.s03lessons.PrimitiveVariables
```

If you migrate to Maven/Gradle later, add a dedicated section here.

---

## Progress

Mark a section done when:
* code is runnable
* you can explain the key concepts
* you merged via PR (checkpoint)
* [x] S03 - Language Fundamentals (`./src/s03languagefundamentals/`)
* [x] S04 - Classes and Objects (`./src/s04classesandobjects/`)
* [ ] S05 - OOP (`./src/s05oop/`)
* [ ] S06 - Collections (`./src/s06collections/`)
* [ ] S07 - Exceptions (`./src/s07exceptions/`)
* [ ] S08 - JSON (`./src/s08json/`)
* [ ] S09 - MVC (`./src/s09mvc/`)
* [ ] S10 - Lombok (`./src/s10lombok/`)

---

## Learning evidence workflow (Git/GitHub)

Even if studying solo, work like a team:
* branch per ticket/topic (internal id)
* PR required as a checkpoint
* DoD + Personal Review Checklist before merge

Minimum for each meaningful update:
* 1 clear commit (intent-focused, English)
* PR with a short summary (what/why)
* optional short `.md` note near code (concept/pitfall/edge case)

Suggested internal ids:
* `S03-Lxx` for lessons (e.g., `S03-L05`)
* `S04-Lxx` for lessons (e.g., `S04-L02`)
* `S03-P01` for section projects (e.g., `S03-P01`)

Branch examples:
* `S03-L05-feature/loops-basics`
* `S04-L02-refactor/rename-classes`
* `S03-P01-feature/grade-calculator`

---

## Practice routing (Labs repo)
When you detect a gap (slow understanding, repeated mistakes, weak edge cases),
create a kata/challenge in the labs repo:

* Labs repo: [https://github.com/v0idbuff3r/java-core-lab](https://github.com/v0idbuff3r/java-core-lab)

---

## Links
* Labs (practice): [https://github.com/v0idbuff3r/java-core-lab](https://github.com/v0idbuff3r/java-core-lab)

---

## License
TBD (to be decided).

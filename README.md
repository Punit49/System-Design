# 🏗️ System Design & Low-Level Design (LLD) Journey

[![Java](https://img.shields.io/badge/Language-Java-orange.svg?style=for-the-badge&logo=java)](https://www.java.com/)
[![System Design](https://img.shields.io/badge/Subject-System%20Design%20%26%20LLD-blue.svg?style=for-the-badge)](https://en.wikipedia.org/wiki/Software_design)
[![Status](https://img.shields.io/badge/Status-In%20Progress-brightgreen.svg?style=for-the-badge)](#curriculum--progress-tracker)
[![Design Patterns](https://img.shields.io/badge/Focus-Clean%20Architecture%20%26%20Design%20Patterns-yellow.svg?style=for-the-badge)](#-design-patterns-toolbox)

> *"Working code gets you through the demo. Well-designed code survives change."*

Welcome to my **System Design & Low-Level Design (LLD)** learning repository! This repo tracks my journey mastering software architecture, object-oriented design, design principles, design patterns, and machine coding for scalable, maintainable enterprise systems.

---

## 🎯 Purpose of this Repository

Writing code that works is only the baseline. In production systems and engineering teams, code must be:
- **Understandable** to other developers
- **Extensible** to new requirements without rewriting existing code
- **Testable** in isolation
- **Resilient** to unexpected inputs and edge cases

This repository serves as a structured archive of:
- 📝 **Class Notes & Whiteboards**: Conceptual breakdowns, diagrams, and mental models.
- 💻 **Hands-on Implementations**: Clean, executable Java code for core OOP patterns and models.
- 🧩 **Machine Coding Solutions**: End-to-end designs for classic problems (Parking Lot, BookMyShow, Splitwise, etc.).
- 📐 **High-Level Design (HLD) Concepts**: System architecture, scalability, load balancing, caching, and data pipelines.

---

## 🔍 The Three Zoom Levels

```
                     ┌────────────────────────────────────────┐
   HLD (City Map)    │  Distributed Architecture & Services   │  (Scalability, Caches, DBs, Load Balancers)
                     └───────────────────┬────────────────────┘
                                         ▼
                     ┌────────────────────────────────────────┐
   LLD (Floor Plan)  │   Class Design & Component Structure   │  (Design Patterns, SOLID, Relationships)
                     └───────────────────┬────────────────────┘
                                         ▼
   DSA (Bricks)      │   Algorithms & Execution Efficiency    │  (Time / Space Complexity, Data Structures)
                     └────────────────────────────────────────┘
```

---

## 🗺️ Curriculum & Progress Tracker

### Phase 1: Java Essentials & OOP Foundations
- [x] **Lecture 1: Introduction to LLD & Java Essentials**
  - What is LLD vs HLD vs DSA?
  - References, Constructors, and variable shadowing (`this`)
  - Encapsulation (`private` state, `public` behavior)
  - `static` vs instance members (class-level shared counters)
  - `final` immutability & constant conventions
  - Type-safe `enum` structures vs raw strings
  - Package architecture (`model/`, `enums/`, `service/`)
- [ ] **Lecture 2: The 4 Pillars of OOP**
  - Encapsulation, Abstraction, Inheritance, and Polymorphism
  - Abstract classes vs Interfaces
  - Method Overriding vs Overloading

### Phase 2: Design Principles (SOLID)
- [ ] **S** — Single Responsibility Principle (SRP)
- [ ] **O** — Open/Closed Principle (OCP)
- [ ] **L** — Liskov Substitution Principle (LSP)
- [ ] **I** — Interface Segregation Principle (ISP)
- [ ] **D** — Dependency Inversion Principle (DIP)

### Phase 3: Gang of Four (GoF) Design Patterns
| Category | Pattern | Problem It Solves | Status |
| :--- | :--- | :--- | :---: |
| **Creational** | Singleton | Single shared instance (logging, configuration, thread pools) | ⏳ |
| **Creational** | Factory / Abstract Factory | Decoupling object creation from business logic | ⏳ |
| **Creational** | Builder | Clean construction of complex objects with optional parameters | ⏳ |
| **Structural** | Adapter | Bridging incompatible interfaces | ⏳ |
| **Structural** | Decorator | Adding responsibilities to objects dynamically without subclassing | ⏳ |
| **Structural** | Facade | Providing a simple unified interface to a complex subsystem | ⏳ |
| **Behavioral** | Strategy | Swapping interchangeable algorithms at runtime (payment, routing) | ⏳ |
| **Behavioral** | Observer | Event-driven pub/sub communication across decoupled objects | ⏳ |
| **Behavioral** | State | Altering behavior dynamically when internal state changes | ⏳ |

### Phase 4: Machine Coding & Real-World Case Studies
- [ ] **Parking Lot System** (Vehicle types, spot assignment, pricing strategies, payment)
- [ ] **Movie Ticket Booking (BookMyShow)** (Concurrent seat locking, theater management)
- [ ] **Splitwise (Expense Sharing)** (Split types: equal, exact, percentage; debt simplification)
- [ ] **Elevator Management System** (Dispatch algorithms, state management)
- [ ] **ATM Machine** (State pattern, cash dispensation, account validation)
- [ ] **Snake & Ladder Game** (Modular board entities, dice strategy)

---

## 📁 Repository Structure

```tree
System Design/
│
├── README.md                                          # Repo overview & roadmap tracker
│
├── Lecture-1 Introduction to System Design and LLD/    # Lecture 1 modules
│   ├── Lecture-01-Whiteboard.excalidraw               # Visual whiteboard diagrams & notes
│   ├── MenuItem.java                                  # In-class OOP starter model
│   └── Homework/
│       └── src/
│           ├── Main.java                              # Driver program & test runner
│           ├── enums/
│           │   ├── AccountType.java                   # SAVINGS, CURRENT
│           │   └── StudentGrade.java                  # A, B, C, D, F
│           └── model/
│               ├── BankAccount.java                   # Encapsulation, validation, static IDs
│               └── Student.java                       # Auto roll-numbers, class-level tracker
│
└── [Upcoming Lectures & Case Studies...]
```

---

## 🛠️ Machine Coding Framework

Whenever approaching an LLD / Machine Coding problem, I follow this 4-step framework:

1. **Clarify Requirements & Constraints**: Identify happy paths, edge cases, and scale expectations.
2. **Define Core Entities & Relationships**: Identify the nouns (classes), adjectives (attributes), and verbs (methods).
3. **Draft Class Diagrams & Apply Patterns**: Establish association, composition, and inheritance without tight coupling.
4. **Implement Clean, Testable Code**:
   - Private fields with validated mutations.
   - Separation of concerns: `model/`, `enums/`, `service/`, `strategy/`.
   - Comprehensive edge-case testing in `Main`.

---

## 💻 Tech Stack & Tools

- **Language:** Java (JDK 17+)
- **Diagramming:** Excalidraw, PlantUML / Mermaid
- **IDE:** Visual Studio Code / IntelliJ IDEA
- **Version Control:** Git & GitHub

---

*“First make it work, then make it right, then make it fast.” — Kent Beck*

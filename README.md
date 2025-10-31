# DFA-String-Acceptance-Checker
This project is a Deterministic Finite Automaton (DFA) simulator in Java that accepts all binary strings ending with “01”.

## 🎯 Objective
Implement a **Deterministic Finite Automaton (DFA)** in Java that **accepts binary strings ending with `01`**.

This program continuously asks for input until the user types `exit`.  
It checks whether the entered binary string belongs to the language of strings that end with `01`.

---

## 🧠 DFA Description

### ✅ Language
**L = { w ∈ {0,1}* | w ends with '01' }**

### 🏷️ States
| State | Description | Accepting? |
|--------|--------------|-------------|
| q0 | Start state | ❌ |
| q1 | Last read symbol was `0` | ❌ |
| q2 | Last two symbols were `01` | ✅ |

### 🔁 Transition Table

| Current State | Input = 0 | Input = 1 |
|----------------|------------|------------|
| **q0** (start) | q1 | q0 |
| **q1** | q1 | q2 |
| **q2** (final) | q1 | q0 |

### 🎨 DFA Diagram
<img width="718" height="357" alt="dfa 1" src="https://github.com/user-attachments/assets/3375b52e-a5f7-489b-989e-4822a9e22273" />

### Sample Runs
<img width="1189" height="684" alt="3" src="https://github.com/user-attachments/assets/f74c9e2c-fa8a-4d6d-b331-3c8cd5b9885e" />
<img width="466" height="321" alt="1" src="https://github.com/user-attachments/assets/6590e64e-bcf0-4ff2-89cb-c8ef7abe13e1" />
<img width="456" height="346" alt="2" src="https://github.com/user-attachments/assets/a88920cb-d4bf-4cb7-a945-ec6105b0a593" />








# 🎯 Number Guessing Game (Java)

## 📌 Project Overview

The **Number Guessing Game** is a simple console-based Java application.
In this game, the computer randomly generates a number between **100 and 500**, and the user has to guess the correct number.

The program provides hints such as **"guess higher"** or **"guess lower"** until the user finds the correct number. It also counts the **number of attempts** taken by the user to guess the number.

This project is useful for learning **Java basics, loops, conditional statements, random number generation, and user input handling**.

---

## 🚀 Key Features

* Random number generation between **100 and 500**
* User input using **Scanner**
* Hint system (Higher / Lower)
* Attempt counter
* Console-based interaction

---

## 🏗 Program Logic

1. The program generates a **random number between 100 and 500**.
2. The user is asked to guess the number.
3. The program compares the guessed number with the generated number.
4. If the guess is:

   * **Greater than the number** → User is asked to guess a lower number.
   * **Less than the number** → User is asked to guess a higher number.
5. The process continues until the correct number is guessed.
6. Once correct, the program displays the **total attempts** taken.

---

## 📂 Project Structure

```
Number-Guessing-Game/
│
├── NumberGuess.java
└── README.md
```

---

## 🛠 Technologies Used

* Java (JDK 8+)
* Core Java Concepts
* Scanner Class
* Random Class

---

## ▶️ How To Run

### 1️⃣ Compile the Program

```bash
javac NumberGuess.java
```

### 2️⃣ Run the Program

```bash
java NumberGuess
```

---

## 💻 Example Output

```
WELCOME TO NUMBER GUESSING GAME <HELLO USER>

Guess a number between 100 to 500 :
250

Not correct! please guess higher number

Guess a number between 100 to 500 :
400

Not correct! please guess lower number

Guess a number between 100 to 500 :
320

Congratullation!! you guess the number in 3 attempt
```

---

## 📈 Learning Outcomes

* Understanding **Random number generation**
* Using **Scanner class for user input**
* Implementing **while loop**
* Applying **conditional statements**
* Building a simple **console-based game**

---

## 🔮 Future Enhancements

* Add **limited attempts**
* Add **difficulty levels**
* Add **score system**
* Convert to **GUI version using Java Swing or JavaFX**

---

## 👨‍💻 Author

Deepak Muduli
Aspiring Java Backend Developer


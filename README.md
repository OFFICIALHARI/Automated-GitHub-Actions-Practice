# 🧮 Automated Java CTF Math Challenge

A beginner-friendly **Java + Maven + GitHub Actions** project that simulates a **CTF (Capture The Flag)** competition.

Participants solve simple math questions using a Java program, submit flags via **GitHub Issues**, and a **GitHub Actions bot** automatically verifies submissions and updates a live leaderboard.

---

## 🚀 Project Features

- ✅ Java-based CTF challenge
- ✅ Flags revealed for correct answers
- ✅ Automated flag verification using GitHub Actions
- ✅ Issue-based submissions (no manual checking)
- ✅ Anti-cheat (duplicate flag prevention)
- ✅ Points system
- ✅ Auto-updated leaderboard
- ✅ Bot comments result and closes issues

---

## 📁 Project Structure

repo-name/
├── src/
│ └── main/
│ └── java/
│ └── Main.java
├── pom.xml
├── README.md
├── leaderboard.md
└── .github/
└── workflows/
└── ctf-bot.yml


---

## 🧠 How the CTF Works

1. User runs the Java program locally
2. Program asks math questions
3. Correct answer prints a **flag**
4. User submits the flag via **GitHub Issue**
5. GitHub Actions bot:
   - Validates the flag
   - Checks for duplicates
   - Assigns points
   - Updates leaderboard
   - Comments result
   - Closes the issue

---

## 🧮 Math Questions & Flags

| Question | Correct Answer | Flag | Points |
|--------|----------------|------|--------|
| 1 + 1 | 2 | `hari` | 10 |
| 1 - 1 | 0 | `kris` | 10 |
| 1 × 1 | 1 | `mozhi` | 20 |
| 1 ÷ 1 | 1 | `varman` | 20 |

---

## ▶️ How to Run the Java Program

### Prerequisites
- Java 17+
- Maven

### Commands

```bash
mvn compile
mvn exec:java -Dexec.mainClass=Main


Sample Output
Q1: 1 + 1 = 2
FLAG: hari

📝 How to Submit a Flag

Go to GitHub → Issues → New Issue

Use this exact format:

name: your_github_username
flag: hari


⚠️ Format must be followed exactly.

🤖 GitHub Actions Bot Rules

✅ Valid flag → points added

❌ Invalid flag → rejected

⚠️ Duplicate flag → no points

🔒 Issue automatically closed after submission

🏆 Leaderboard

Leaderboard is maintained in leaderboard.md
It is automatically updated by GitHub Actions.

Example:

| GitHub Username | Points | Solved Flags |
|-----------------|--------|--------------|
| harikrishnan | 30 | hari,mozhi |

🔐 Anti-Cheat Measures
One flag can be submitted only once per user
Duplicate submissions are ignored
Only predefined flags are accepted

🛠 Technologies Used
Java 17
Maven
GitHub Actions
GitHub Issues API
Bash scripting
Markdown
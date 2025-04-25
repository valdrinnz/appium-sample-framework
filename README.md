# Sample Appium Mobile Framework in Java
## Prerequisites
Make sure you have the following installed and configured:
- Java (JDK 11 or later)
- Node.js (v14 or later)
- Android SDK
- ADB (Android Debug Bridge)
- Android Emulator
- Maven
- Appium
- IntelliJ or Android Studio
## Steps to Run the Tests
1. **Clone this repository** to your local machine:
   ```bash
   git clone https://github.com/valdrinnz/appium-sample-framework
2. **Open the project in Android Studio or IntelliJ IDEA.**
3. **Start the Appium server:**
   ```bash
   appium server -p 4725 -a 127.0.0.1 -pa /wd/hub
4. **Start the Android emulator (e.g., Pixel 3A):**
   ```bash
   emulator -avd Pixel3A
5. Run the tests using Maven:
    ```bash
    mvn clean verify
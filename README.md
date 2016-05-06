# Selenium Example
Selenium Example with multiples drives running in same interface.

##Requirements
- Maven3+
- Appium
- Selendroid
- Android SDK: **ANDROID_HOME** on path
- **JAVA_HOME** on path (tested with java8)
- Firefox latest version installed

## Configuring
### Dependencies
```bash
mvn eclipse:eclipse
```

###Running
####On Firefox
```bash
mvn test -Pfirefox
```

####Another Envs
```bash
-Pappium
-Pselendroid
```
# Compiler and flags
JAVAC = javac
JAR = jar
JFLAGS = -Xlint:all -Xlint:-serial -Werror # Enable all warnings, except serial, treat warnings as errors

# Project structure
SRC = Main.java Message.java
BIN_DIR = bin
CLASS_FILES = $(BIN_DIR)/Main.class $(BIN_DIR)/Message.class
JAR_FILE = app.jar

.PHONY: all clean
# Default target
all: $(JAR_FILE)

# Compile Java files
$(CLASS_FILES): $(SRC)
	mkdir -p $(BIN_DIR)
	$(JAVAC) $(JFLAGS) -d $(BIN_DIR) $(SRC)

# Package compiled classes into a .jar
$(JAR_FILE): $(CLASS_FILES)
	$(JAR) cfe $(JAR_FILE) Main -C $(BIN_DIR) .

# Run the program
run: $(JAR_FILE)
	java -jar $(JAR_FILE)

# Clean up compiled files
clean:
	rm -rf $(BIN_DIR) $(JAR_FILE)

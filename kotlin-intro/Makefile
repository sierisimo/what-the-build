
# Compiler and tools
KOTLINC = kotlinc
JAR = jar

# Project structure
SRC = Main.kt
BIN_DIR = bin
MAIN_CLASS = MainKt
JAR_FILE = app.jar

.PHONY: all run clean

# Default target: Compile & package
all: $(JAR_FILE)

# Compile Kotlin files
$(BIN_DIR)/$(MAIN_CLASS).class: $(SRC)
	mkdir -p $(BIN_DIR)
	$(KOTLINC) $(SRC) -d $(BIN_DIR)

# Package into a JAR with Kotlin runtime
$(JAR_FILE): $(BIN_DIR)/$(MAIN_CLASS).class
	$(JAR) cfe $(JAR_FILE) $(MAIN_CLASS) -C $(BIN_DIR) .

# Run the Kotlin JAR (Requires Kotlin runtime)
run: $(JAR_FILE)
	kotlin -classpath $(JAR_FILE) $(MAIN_CLASS)

# Clean compiled files
clean:
	rm -rf $(BIN_DIR) $(JAR_FILE)

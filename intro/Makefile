# Configure flags and options
#
# Essentially have variables!
CC_FLAGS = -Wall -Wextra # -Werror

# Create virtual tasks, things that need to be done to obtain a program
.PHONY: all run clean

# Common name for listing the files involved
all: main # <<-- This is a task or a file that need to be executed or created

run: main # <<-- No dependendencies
	./main

main: main.o # <<-- Dependencies for this file to be completed
	gcc main.o -o main # Instruction to execute in order to obtain the expected file

main.o: main.c # <<-- Make will check if this exists or is merely a regular file 
	gcc $(CC_FLAGS) -c main.c # Same, instruction using the variables defined at top

# PHONY task, conventionally for removing files generated during compilation or to clean
# the directory
clean:
	rm -f main main.o

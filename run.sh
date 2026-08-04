#!/bin/sh
# Compile everything into out/ and start the menu.
#   ./run.sh        -> menu
#   ./run.sh 15     -> run program 15 directly

javac -d out src/*.java || exit 1
java -cp out Runner "$@"

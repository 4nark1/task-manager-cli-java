@echo off
echo Compiling project...
javac -cp gson-2.13.2.jar *.java

echo Running application...
java -cp .;gson-2.13.2.jar Main

pause
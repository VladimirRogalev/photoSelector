@echo off


set regex=%1
set pictures=%2

java -cp . telran.regex.tools.PhotoSelector %regex% %pictures%
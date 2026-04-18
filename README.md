assembly x86 compiler


javac --release 25 -cp .:antlr-4.9.2-complete.jar *.java


javac --release 25 -cp .:antlr-4.9.2-complete.jar *.java


java -cp .:antlr-4.9.2-complete.jar Main my.asm


file output


cat ./output


objdump -D -b binary -mi386 output

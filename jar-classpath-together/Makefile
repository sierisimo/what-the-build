.PHONY: all main clean

all: main

main: jar/message.jar jar/printer.jar out/main/MainKt.class
	kotlin -classpath jar/message.jar:jar/printer.jar:out/main MainKt

jar/message.jar: out/message/Message.class
	jar cf jar/message.jar -C out/message .

jar/printer.jar: jar/message.jar out/printer/PrinterKt.class
	jar cf jar/printer.jar -C out/printer .

out/message/Message.class:
	kotlinc Message.kt -d out/message

out/printer/PrinterKt.class:
	kotlinc -classpath jar/message.jar Printer.kt -d out/printer

out/main/MainKt.class:
	kotlinc -classpath jar/message.jar:jar/printer.jar:. Main.kt -d out/main

clean:
	rm -rf jar out META-INF



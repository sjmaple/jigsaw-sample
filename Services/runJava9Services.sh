rm -rf out

javac --module-source-path src -d out $(find . -name *.java)

java --module-path out -m org.zeroturnaround.consumer/org.zeroturnaround.consumer.Consumer

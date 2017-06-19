rm -rf image
$JAVA_HOME/bin/jlink --module-path out:$JAVA_HOME/jmods \
  --add-modules org.zeroturnaround.consumer \
  --add-modules org.zeroturnaround.provider \
  --add-modules org.zeroturnaround.api \
  --compress=2 \
  --output image

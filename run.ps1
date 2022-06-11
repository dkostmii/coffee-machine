$executable = "target\coffee-machine-1.0-SNAPSHOT.jar"

if (-not (Test-Path $executable -PathType Leaf)) {
  .\build.ps1
}

java -cp $executable coffeefactory.App

import play.Project._

name := "computer-database"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean,
  "joda-time"         % "joda-time"         % "2.3"
)

playJavaSettings

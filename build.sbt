
name := "sbt-template"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq( )

assemblyMergeStrategy in assembly := {
 case PathList("META-INF", xs @ _*) => MergeStrategy.discard
 case x => MergeStrategy.first
}

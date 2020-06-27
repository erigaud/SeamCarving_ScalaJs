name := "SeamCarving_ScalaJs"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.7"

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true   // application ayant une méthode main
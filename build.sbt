seq(webSettings :_*)

name := "html5push"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "7.5.3.v20111011" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default"
)



scalaVersion := "2.9.1"

seq(appengineSettings: _*)

libraryDependencies ++= Seq (
  "net.liftweb" %% "lift-json" % "2.4",
  "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-json" % "$unfiltered_version$",
  "org.slim3" % "slim3" % "1.0.13",
  "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test",
  "org.scala-tools.testing" %% "specs" %"1.6.6" % "test",
  "javax.servlet" % "servlet-api" % "2.3" % "provided",
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"
)

autoCompilerPlugins := true

addCompilerPlugin("scalatohoku.slim3" %% "slim3modelmetageneratorplugin" % "0.1.1")

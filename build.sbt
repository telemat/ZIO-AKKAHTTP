name := "zio"

version := "0.1"

scalaVersion := "2.12.12"

lazy val akkaVer = "2.6.17"
lazy val akkaHttpVer = "10.2.7"

libraryDependencies ++= Seq (
  "dev.zio"                 %% "zio"                  % "1.0.12",
  "com.typesafe"            % "config"                % "1.4.1",
  "com.github.mauricio"     %% "mysql-async"          % "0.2.21",
  "com.typesafe.akka"       %% "akka-http"            % akkaHttpVer,
  "com.typesafe.akka"       %% "akka-http-spray-json" % akkaHttpVer,
  "com.typesafe.akka"       %% "akka-stream"          % akkaVer
)

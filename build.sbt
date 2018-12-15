name := "SANSA-Template-SBT-Flink"

version := "0.5.1-SNAPSHOT"

scalaVersion := "2.11.11"

val varscalaVersion = "2.11.11"
val varscalaBinaryVersion = "2.11"

val sansaRDFVersion = "0.5.0"
val sansaOWLVersion = "0.4.1"
val sansaQueryVersion = "0.5.0"
val sansaInferenceVersion = "0.5.0"
val sansaMLVersion = "0.5.0"

val flinkVersion = "1.7.0"

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion,
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion,
  "org.apache.flink" %% "flink-clients" % flinkVersion
)


libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-library" % varscalaVersion
)

// | Resolvers
resolvers ++= Seq(
  "AKSW Maven Releases" at "http://maven.aksw.org/archiva/repository/internal",
  "AKSW Maven Snapshots" at "http://maven.aksw.org/archiva/repository/snapshots",
  "oss-sonatype" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Apache repository (snapshots)" at "https://repository.apache.org/content/repositories/snapshots/",
  Resolver.defaultLocal,
  Resolver.mavenLocal,
  "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
  "Apache Staging" at "https://repository.apache.org/content/repositories/staging/"
)

// | SANSA Layers
libraryDependencies ++= Seq(
    "net.sansa-stack" %% "sansa-rdf-flink" % sansaRDFVersion,
    "net.sansa-stack" %% "sansa-owl-flink" % sansaOWLVersion,
    "net.sansa-stack" %% "sansa-inference-flink" % sansaInferenceVersion,
    "net.sansa-stack" %% "sansa-query-flink" % sansaQueryVersion,
    "net.sansa-stack" %% "sansa-ml-flink" % sansaMLVersion
)

# Domino

[![Join the chat at https://gitter.im/scalajs-domino/Lobby](https://badges.gitter.im/scalajs-domino/Lobby.svg)](https://gitter.im/scalajs-domino/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Domino is a library for declarative HTML rendering in Scala.js.

## Example

```scala
package org.domino

import org.domino.html.HTML
import org.scalajs.dom.document

object App {
  import HTML._

  def page() =
    div(
      h1("Hello, world!"),
      p(id := "description", title := "These are attributes.")(
        "This page was rendered with the Domino library for Scala.js."),
      p("Enjoy!"))

  def main(args: Array[String]): Unit = {
    val root = document.getElementById("root")
    Domino.render(page(), root)
  }
}
```

## Install
Add the following to your `build.sbt`.

	resolvers += "jitpack" at "https://jitpack.io"
	libraryDependencies += "com.github.snordgren" % "domino" % "-SNAPSHOT"

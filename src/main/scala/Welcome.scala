object Welcome extends App {

  val name = sys.props.get("user.name").map(_.capitalize).getOrElse("Stranger")
  println(s"Welcome $name")
}

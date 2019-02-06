package practice

object B088{
  def main(args: Array[String]){
    if (sys.env.getOrElse("TEST", "")=="1"){
      println(test())
    }else{
      val input=io.Source.stdin.getLines().mkString("\n")
      println(solve(input).trim())
    }
  }

  def solve(input:String):String={
    val list = input.split("\n")(1).split(" ").map(_.toInt).toList.sorted.reverse.zipWithIndex
    val alice = list.filter(v => v._2 % 2 == 0).map(v => v._1).sum
    val bob = list.filter(v => v._2 % 2 == 1).map(v => v._1).sum
    (alice - bob).toString
  }


  val tests=List(
    """
      |3
      |2 7 4
    """.stripMargin-> """5""",
    """
      |4
      |20 18 2 18
    """.stripMargin -> """18""",
    """
      |2
      |3 1
    """.stripMargin -> """2""")

  def test():String= {
    return tests.map{case (i,o)=>(i.trim(),o.trim())}
      .zipWithIndex.map{
      case ((input,outputExpect),i)=>{
        val output=solve(input).trim()
        s"test${i+1}:"+(if(output==outputExpect){
          "Passed"
        }else{
          s"Failed\nexpect:\n${outputExpect}\noutput:\n${output}"
        })
      }}
      .mkString("\n")
  }
}
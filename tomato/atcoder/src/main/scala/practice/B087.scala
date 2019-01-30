package practice

object B087{
  def main(args: Array[String]){
    if (sys.env.getOrElse("TEST", "")=="1"){
      println(test())
    }else{
      val input=io.Source.stdin.getLines().mkString("\n")
      println(solve(input).trim())
    }
  }

  def solve(input:String):String={
    val List(a, b, c, x) = input.split("\n").map(_.toInt).toList
    val gohyaku = (0 to a).map(_*500)
    val hyaku = (0 to b).map(_*100)
    val gojuu = (0 to c).map(_*50)
    val sum = gohyaku.flatMap(i => hyaku.flatMap(j => gojuu.map(k => i + j + k)))
    sum.count(_==x).toString
  }


  val tests=List(
    """
      |5
      |1
      |0
      |150
    """.stripMargin -> """0""",
    """
      |2
      |2
      |2
      |100
    """.stripMargin -> """2""",
    """
      |30
      |40
      |50
      |6000
    """.stripMargin -> """213""")

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
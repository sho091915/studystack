package practice

object C085{
  def main(args: Array[String]){
    if (sys.env.getOrElse("TEST", "")=="1"){
      println(test())
    }else{
      val input=io.Source.stdin.getLines().mkString("\n")
      println(solve(input).trim())
    }
  }

  def solve(input:String):String={
    val List(n, y) = input.split(" ").map(_.toInt).toList
    val itiman = (0 to n).toList
    val gosen = (0 to n).toList
    val ans = itiman.flatMap(i => gosen.map(j => if ((i*10000)+(j*5000) + (Math.abs(n-i-j)*1000) == y && i+j<=n) {i + " " + j + " " + Math.abs(n-i-j)} else {""} ))
    val res = ans.filter(_ !="")
    if (res.nonEmpty) {
      res.head
    }else{
      "-1 -1 -1"
    }
  }


  val tests=List(
    """
      |3
      |15
      |15
      |15
    """.stripMargin-> """1""",
    """
      |7
      |50
      |30
      |50
      |100
      |50
      |80
      |30
    """.stripMargin -> """4""",
    """
      |4
      |10
      |8
      |8
      |6
    """.stripMargin -> """3""")

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
package practice

object C065{
  def main(args: Array[String]){
    if (sys.env.getOrElse("TEST", "")=="1"){
      println(test())
    }else{
      val input=io.Source.stdin.getLines().mkString("\n")
      println(solve(input).trim())
    }
  }

  def solve(input:String):String={
    if(f(input.toList.reverse)){
      "YES"
    }else{
      "NO"
    }
  }

  def f(s:List[Char]):Boolean={
    s match{
      case 'm'::'a'::'e'::'r'::'d'::t =>f(t)
      case 'r'::'e'::'m'::'a'::'e'::'r'::'d'::t =>f(t)
      case 'e'::'s'::'a'::'r'::'e'::t =>f(t)
      case 'r'::'e'::'s'::'a'::'r'::'e'::t =>f(t)
      case Nil=>true
      case _=>false
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
import java.util.Date;
class Kaiin {
  private int id;
  private String name;
  private Date addDate;

  public Kaiin(){
    id = 0;
    name = "";
    addDate = null;
    //基本初期化処理
  }
  public void setId(int id){
    this.id = id;
  }
  public void setName(String st){
    this.name = st;
  }
  public void setDate(Date aD){
    this.addDate = aD;
  }

  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public Date getDate(){
    return addDate;
  }
}

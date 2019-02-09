import java.util.*;
import java.text.SimpleDateFormat;
class Register{
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
    List<Kaiin> kaiinAll = new ArrayList<>();//データベースみたいな
    kaiinAll.add(kaiinAdd(1,"山田太郎"));
    kaiinAll.add(kaiinAdd(2,"鈴木花子"));
    kaiinAll.add(kaiinAdd(3,"佐藤琢磨"));
    int input =  new Scanner(System.in).nextInt();
    for(Kaiin k:kaiinAll){
      if(k.getId() == input){
        System.out.printf("%sさんの会員IDは%04dです。登録: %s\n", k.getName(), k.getId(), sdf.format(k.getDate()));
        // System.out.println(k.getName()+"さんの会員IDは"+k.getId()+"です。"+"登録："+sdf.format(k.getDate()));
      }
    }
  }
  public static Kaiin kaiinAdd(int id,String name){
    Kaiin k = new Kaiin();
    Date d = new Date();
    k.setId(id);
    k.setName(name);
    k.setDate(d);
    return k;
  }
}

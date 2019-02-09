import java.util.*;

class Kakezan{
  public static void main(String[] args) {
    System.out.print("西暦を入力してください>");
    Scanner s = new Scanner(System.in);
    int seinen = s.nextInt();
    String[] jikkan = jikkan(seinen);
    String[] junishi = junishi(seinen);
    System.out.println(seinen+"年の干支は"+jikkan[0]+junishi[0]+"("+ jikkan[1]+junishi[1] +")です。");
  }
  private static String[] jikkan(int seinen){
    String res[] = new String[2];
    switch (seinen % 10) {
      case 0:
      res[0] = "庚";
      res[1] = "かのえ";
      break;
      case 1:
      res[0] = "辛";
      res[1] = "かのと";
      break;
      case 2:
      res[0] = "壬";
      res[1] = "みずのえ";
      break;
      case 3:
      res[0] = "癸";
      res[1] = "みずのと";
      break;
      case 4:
      res[0] = "甲";
      res[1] = "きのえ";
      break;
      case 5:
      res[0] = "乙";
      res[1] = "きのと";
      break;
      case 6:
      res[0] = "丙";
      res[1] = "ひのえ";
      break;
      case 7:
      res[0] = "丁";
      res[1] = "ひのと";
      break;
      case 8:
      res[0] = "戊";
      res[1] = "つちのえ";
      break;
      case 9:
      res[0] = "己";
      res[1] = "つちのと";
      break;
    }
    return res;
  }
  private static String[] junishi(int seinen){
    String res[] = new String[2];
    switch (seinen % 12) {
      case 0:
      res[0] = "申";
      res[1] = "さる";
      break;
      case 1:
      res[0] = "酉";
      res[1] = "とり";
      break;
      case 2:
      res[0] = "戌";
      res[1] = "いぬ";
      break;
      case 3:
      res[0] = "亥";
      res[1] = "い";
      break;
      case 4:
      res[0] = "子";
      res[1] = "ねずみ";
      break;
      case 5:
      res[0] = "丑";
      res[1] = "うし";
      break;
      case 6:
      res[0] = "寅";
      res[1] = "とら";
      break;
      case 7:
      res[0] = "卯";
      res[1] = "う";
      break;
      case 8:
      res[0] = "辰";
      res[1] = "たつ";
      break;
      case 9:
      res[0] = "巳";
      res[1] = "へび";
      break;
      case 10:
      res[0] = "午";
      res[1] = "うま";
      break;
      case 11:
      res[0] = "未";
      res[1] = "ひつじ";
      break;
    }
    return res;
  }

}

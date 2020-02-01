
class Ipod extends Title implements Player{
  String music;
  String artists;

  public void start(){
    System.out.println("ひかえみに再生します");
  }
  public void pause(){
    System.out.println("かしこまりました、一時停止します");
  }
  public void stop(){
    System.out.println("再生を停止しました");
  }

  // コンストラクタ
  public Ipod(String music,String artists){
    this.music = music;
    this.artists = artists;
    System.out.println("iPodの使用を開始します");
  }


  public void useIpod(){
    // if(this.music==null && this.artists==null || String.getBytes(this.music).length ==0&& String.getBytes(this.artists).length ==0){
    //   System.out.println("再生に失敗しました");
    //   // break;
    // }else{
      Title title = new Title();
      title.display(this.music,this.artists);
      //※インスタンスの作成、Titleのdisplayメソッドを呼ぶ。
    // }
  }
}

class Walkman extends Title implements Player{

  String music;
  String artists;

  public void start(){
    System.out.println("爆速で再生します");
  }
  public void pause(){
    System.out.println("３分間待ってやる");
  }
  public void stop(){
    System.out.println("停止しました");
  }

  // コンストラクタ
  public Walkman(String music,String artists){
    this.music = music;
    this.artists = artists;
    System.out.println("walkmanの使用を開始します");
  }


  public void useWalkman(){
    // if(this.music==null && this.artists==null || String.getBytes(this.music).length ==0&& String.getBytes(this.artists).length ==0){
    //   System.out.println("再生に失敗しました");
    // }else{
      Title title = new Title();
      title.display(this.music,this.artists);
      //※インスタンスの作成、Titleのdisplayメソッドを呼ぶ。
    // }

  }
}

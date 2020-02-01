class MusicPlayAction{
  public static void main(String[] args){
    String music = "ブルーバード";
    String artists = "いきものがかり";

    // Walkman walkman = new Walkman(music,artists);
    // walkman.useWalkman();
    // walkman.start();
    // walkman.pause();
    // walkman.stop();
    Ipod ipod = new Ipod(music,artists);
    ipod.useIpod();
    ipod.start();
    ipod.pause();
    ipod.stop();
    // Walkman walkman ＝　new Walkman(music, artists);
    // Ipod ipod ＝　new ipod(music, artists);
    //いきものがかり　ブルーバード
  }
}

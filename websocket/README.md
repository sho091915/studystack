# Python で WebSocket

## PythonのWebフレームワークについて
Pythonのフレームワークはなんかいっぱいある。  
* 大きめ ・・・ Django
* 中くらい ・・・ Tornado
* 小さめ ・・・ Flask, Bottle  

的な認識かなあ、現状は。
[参考はこちら](https://www.high-performer.jp/engineer/trend/python-framework/)

### Django
大きめではあるけど、Rails的な大きさではない。色々出来る、一応1番人気？
* [チュートリアル](https://docs.djangoproject.com/ja/2.1/intro/)
* [Qiita記事](https://qiita.com/gragragrao/items/373057783ba8856124f3)
* [WebSocket](https://channels.readthedocs.io/en/latest/)
* [WebSocket日本語](http://www.denzow.me/entry/2018/03/25/235952)


### Trnado
Trnadoは標準でWebsocket がサポートされているらしく、Websocket だけやるなら楽そうだけど、日本語の文献が少ないので大変かも
* [WebSocket](https://www.tornadoweb.org/en/stable/websocket.html)


### Flask
めっちゃ軽量で、Webサーバ立てるだけとかちょっとしたことするだけなら少ないコードでささっと書けて便利。  
反面DBめっちゃ使うとかエンドポイント多いとか認証とかややこしいことしようとするとちょっと大変なイメージ
* [チュートリアル](http://flask.pocoo.org/docs/1.0/tutorial/)
* [使ってみた](https://qiita.com/ynakayama/items/2cc0b1d3cf1a2da612e4)
* [WebSocket](http://python.zombie-hunting-club.com/entry/2017/11/03/224003)


基本はDjangoが良さそうかなあ、こういう時人気かどうかって大事。  

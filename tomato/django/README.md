Djangoで書かれたいくつかのアプリがあります。

`mysite`には[このドキュメント](https://docs.djangoproject.com/ja/2.1/intro/)を参考に作った最初のアプリがあります。  
```
pipenv shell
cd mysite
python manage.py runserver
```
で`http://127.0.0.1:8000/`に立つはずです。

`ws`には[このドキュメント](https://channels.readthedocs.io/en/latest/)を参考に作ったWebSocketを用いたToDoリストがあります。
```
pipenv shell
cd ws
python manage.py runserver
```
で`http://127.0.0.1:8000/todo`に立つはずです。  
KVSとしてRedisを使っているので、`docker run -p 6379:6379 -d redis:2.8`も必要です。

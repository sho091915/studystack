#include <stdio.h>

// 偶数かどうか
int isEven(int x){
  if(x%2==0){
    return 1;
  } else {
    return 0;
  }
}

// 2で割れるか
int isDiv2(int x){
  if(x%2==0 && x!=0){
    return 1;
  } else {
    return 0;
  }
}

int main(){
  int num=0, i=0, count=0;
  int blackboard[200];
  // 空白区切り数字の個数
  if(scanf("%d\n", &num) == 0) return 1;
  for(i=0;i<num;i++){
    // scanf関数は空白/タブ/改行を区切りと認識する
    if(scanf("%d", &blackboard[i]) == 0) return 1;
    // 偶数でないか、0の場合は1度も2で割れない
    // if(!isEven(blackboard[i]) || blackboard[i] == 0){
    if(!isDiv2(blackboard[i])){
      printf("%d\n", 0);
      return 0;
    }
  }
  while (1) {
    count++;
    for(i=0;i<num;i++){
      blackboard[i]/=2;
      // 偶数でないか、0の場合はもう2で割れない
      // if(!isEven(blackboard[i]) || blackboard[i] == 0){
      if(!isDiv2(blackboard[i])){
        printf("%d\n", count);
        // breakだとforを抜けるだけでwhile抜けてくれないのでreturn
        return 0;
      }
    }
  }
  printf("%d\n", count);
  return 0;
}

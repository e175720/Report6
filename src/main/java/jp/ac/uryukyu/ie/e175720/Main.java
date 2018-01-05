package jp.ac.uryukyu.ie.e175720;

public class Main {
    private static int coin;

    //初期設定。
    public static void main(String[] args) {
        coin = 1000;
        System.out.println("カジノへようこそ\n所持チップ：" + coin);
    }

    //ゲームの選択。
    public void selectGame(){
        int selectgame = 1;
        //selectgameはあとでユーザー入力ができるようにする。
        System.out.println("どのゲームで遊びますか？\n1：ポーカー");
        if (selectgame==1){
            Poker poker = new Poker(coin);
            betCoin(50);
            poker.game();

        }

    }

    public int getCoin(){
        return coin;
    }


    //コインをいくら賭けたか表示するメソッド。
    public void betCoin(int coin){
        coin -= this.coin;
        System.out.println("コインを"+ this.coin +"賭けました。");
    }

    //コインの増減を表示するメソッド。
    public void plusCoin(int coin) {
        coin += this.coin;
        if(this.coin>0){
            System.out.println("コインを"+ this.coin+ "獲得しました。");
        }else if(this.coin<0){
            System.out.println("コインを"+ this.coin + "失いました。");
        }


    }
}

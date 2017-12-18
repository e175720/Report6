package jp.ac.uryukyu.ie.e175720;

public class Main {
    private static int coin;

    public static void main(String[] args) {
        coin = 1000;
        System.out.println("カジノへようこそ\n所持チップ：" + coin);
    }

    public void selectGame(){
        int selectgame = 0;
        System.out.println("どのゲームで遊びますか？\n1：ポーカー");
        if (selectgame==1){
            
        }

    }

    public int getCoin(){
        return coin;
    }

    public void plusCoin(int coin) {
        coin += this.coin;
    }
}

package jp.ac.uryukyu.ie.e175720;
import java.math.*;

public class Poker {
    private int coin;
    private String[] hands;
    private String same;
    private boolean samej = false;
    private String change;

    public Poker(int coin){
        coin = this.coin;
    }

    public void game(){
        System.out.println("カードを配ります。");
        hands = new String[5];
        for(int i=0; i<5; i++){
            hands[i] = drawCard();
            if (i>=1){
                for(int j=0; j<i; j++){
                    if(hands[j]==hands[i]){
                        hands[i] = null;
                        samej = true;
                    }
                }
                if(samej){
                    i = i-1;
                    samej = false;
                }
            }
        }
        for(int look = 0;look<5; look++){
            System.out.println(look+1 + ":" + hands[look]);
        }
        System.out.println("交換するカードを記入してください。例：1,3  2,4,5");
        change = "1,2";
        

    }

    public String drawCard(){
        String[] card = {"♡A","♡2","♡3","♡4","♡5","♡6","♡7","♡8","♡9","♡10","♡J","♡Q","♡K",
                         "♧A","♧2","♧3","♧4","♧5","♧6","♧7","♧8","♧9","♧10","♧J","♧Q","♧K",
                         "♤A","♤2","♤3","♤4","♤5","♤6","♤7","♤8","♤9","♤10","♤J","♤Q","♤K",
                         "♢A","♢2","♢3","♢4","♢5","♢6","♢7","♢8","♢9","♢10","♢J","♢Q","♢K",
                         "JOKER"};
        int select = (int)(Math.random() * 53);
        String got = card[select];
        return got;
    }
}

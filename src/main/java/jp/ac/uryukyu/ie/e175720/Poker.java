package jp.ac.uryukyu.ie.e175720;
import java.math.*;

public class Poker {
    private int coin;
    private String[] hands;
    private String[] same;
    private boolean samej = false;
    private String change;

    public Poker(int coin){
        coin = this.coin;
    }

    public void game(){
        System.out.println("カードを配ります。");
        hands = new String[5];
        same = new String[10];
        for(int i=0; i<5; i++){
            hands[i] = drawCard();
            same[i] = hands[i];
            if (i>=1){
                for(int j=0;j<i;j++){
                    if(same[j]==hands[i]){
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
        //changeはあとでユーザーが入力できるようにする。
        change = "1,2";
        String[] num = change.split(",",0);
        for(int k=0;k<num.length;k++){
            hands[k] = drawCard();
            for(int l=0;l<5+k;l++){
                if(same[l]==hands[k]){
                    samej = true;
                }
            }
            if(samej){
                k = k-1;
                samej = false;
            }

        }
        for(int look = 0;look<5; look++) {
            System.out.println(look + 1 + ":" + hands[look]);
        }
        result(hands);
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

    public void result(String[] take){

        String m1;
        String n1;
        for(int m=0;m<5;m++){
            String[] takes = take[m].split("", 0);
            if(m==0){
                m1 = takes[0];
                n1 = takes[1];
            }else{
                if(m1==takes[0]){

                }
            }
        }



    }
}

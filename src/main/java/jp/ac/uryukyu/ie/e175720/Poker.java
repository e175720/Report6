package jp.ac.uryukyu.ie.e175720;
import java.math.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    private int coin;
    private List<Card> hands = new ArrayList<Card>();
    private String[] same;
    private boolean samej = false;
    private String change;

    public Poker(int coin){
        coin = this.coin;
    }

    public void game(){
        System.out.println("カードを配ります。");
        List<Card> deck = deckMake();
        Collections.shuffle(deck);
        for(int k=1;k<=5;k++){
            hands.add(deck.get(0));
            deck.remove(0);
            Card look = hands.get(k-1);
            switch (look.getNumber()){
                case 0:
                    System.out.println(k +":"+ look.getMark());
                    break;
                default:
                    System.out.println(k +":"+ look.getMark()+look.getNumber());
                    break;
            }

        }

        System.out.println("交換するカードを記入してください。例：1,3  2,4,5");
        //changeはあとでユーザーが入力できるようにする。
        String change = "4,5";
        String[] changen = change.split(",",0);
        int[] num = new int[changen.length];
        for(int l=0;l<num.length;l++){
            num[l] = Integer.parseInt(changen[l])-1;
        }
        for(int m=0;m<num.length;m++){
            hands.set(num[m],deck.get(0));
            deck.remove(0);
        }


        for(int g=1;g<=5;g++){
            Card look = hands.get(g-1);
            switch (look.getNumber()){
                case 0:
                    System.out.println(g +":"+ look.getMark());
                    break;
                default:
                    System.out.println(g +":"+ look.getMark()+look.getNumber());
                    break;
            }
        }

    }

    public List<Card> deckMake(){
        List<Card> card = new ArrayList<Card>();
        for(int i=1;i<=4;i++){
            String sym;
            if(i==1){
                sym = "♡";
            }else if(i==2){
                sym = "♧";
            }else if(i==3){
                sym = "♤";
            }else{
                sym = "♢";
            }
            for(int j=1;j<=13;j++){
                Card a = new Card(j,sym);
                card.add(a);
            }
        }
        card.add(new Card(0,"joker"));
        return card;
    }


}

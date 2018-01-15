package jp.ac.uryukyu.ie.e175720;
import java.util.*;

public class Poker {
    private int coin;
    private List<Card> hands = new ArrayList<Card>();

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
                case 1:
                    System.out.println(k +":"+ look.getMark()+"A");
                    break;
                case 11:
                    System.out.println(k +":"+ look.getMark()+"J");
                    break;
                case 12:
                    System.out.println(k +":"+ look.getMark()+"Q");
                    break;
                case 13:
                    System.out.println(k +":"+ look.getMark()+"K");
                    break;
                default:
                    System.out.println(k +":"+ look.getMark()+look.getNumber());
                    break;
            }

        }

        System.out.println("交換するカードを記入してください。例：1,3  2,4,5");
        //changeはあとでユーザーが入力できるようにする。
        String change = "4,5";
        if(change==""){

        }else {
            String[] changen = change.split(",", 0);
            int[] num = new int[changen.length];
            for (int l = 0; l < num.length; l++) {
                num[l] = Integer.parseInt(changen[l]) - 1;
            }
            for (int m = 0; m < num.length; m++) {
                hands.set(num[m], deck.get(0));
                deck.remove(0);
            }
        }
        for (int g = 1; g <= 5; g++) {
            Card look = hands.get(g - 1);
            switch (look.getNumber()) {
                case 0:
                    System.out.println(g + ":" + look.getMark());
                    break;
                case 1:
                    System.out.println(g + ":" + look.getMark() + "A");
                    break;
                case 11:
                    System.out.println(g + ":" + look.getMark() + "J");
                    break;
                case 12:
                    System.out.println(g + ":" + look.getMark() + "Q");
                    break;
                case 13:
                    System.out.println(g + ":" + look.getMark() + "K");
                    break;
                default:
                    System.out.println(g + ":" + look.getMark() + look.getNumber());
                    break;
            }
        }
        result(hands);

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

    public void result(List<Card> hand){
        int c=0;
        Map<Integer, Integer> same = new HashMap<Integer, Integer>();
        int same_one = 0;
        List<Integer> check = new ArrayList<Integer>();
        List<Integer> card_num = new ArrayList<Integer>();
        for(int b=0;b<5;b++){
            Card look = hand.get(b);
            card_num.add(look.getNumber());
        }
        int card_n = card_num.size();
        for(int a=1;a<card_n;a++){
            if(card_num.get(c)==card_num.get(a)){
                same_one++;
                card_num.remove(a);
                card_n--;
                a--;
            }
            if(same_one==0){
                c++;
                card_n--;
                a--;
            }else{
                same.put(card_num.get(0), same_one);
                System.out.println(same.get(card_num.get(0)));
            }
            same_one = 0;
        }
        for(int p=0;p<5;p++){
            System.out.println(same.get(p));
        }


    }

}

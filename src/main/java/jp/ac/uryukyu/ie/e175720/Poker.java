package jp.ac.uryukyu.ie.e175720;
import java.math.*;

public class Poker {
    private int coin;
    private int[][] hands;
    private int[] same;


    public Poker(int coin){
        coin = this.coin;
    }

    public void game(){
        System.out.println("カードを配ります。");
        same = new int[2];
        hands = new int[5][2];
        for(int i=0; i<5; i++){
            hands[i][0] = drawNumber();
            hands[i][1] = drawMark();

        }

    }

    public int drawNumber(){
        int draw_num = (int)(Math.random() * 13);
        int card = draw_num;
        return card;
    }

    public int drawMark(){
        int draw_mark = (int)(Math.random() * 4);
        int card = draw_mark;
        return card;
    }

    public boolean sameDraw(int[] same_card){
        
    }
}

package jp.ac.uryukyu.ie.e175720;

public class Card {
    private int number;
    private String mark;

    public Card(int num,String mark){
        this.number = num;
        this.mark = mark;
    }

    public int getNumber(){
        return number;
    }

    public String getMark(){
        return mark;
    }
}

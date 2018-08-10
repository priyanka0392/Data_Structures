package LeetCode;

import java.util.LinkedList;

public class Card {
    Type typeCard;
    Number number;

    public Card() {
        LinkedList cards = new LinkedList();

        for(int i=0 ; i<4 ; i++) {
            Type t = Type.values()[i];
            for(int j=0 ; j<13; j++) {
             Card card = new Card(t,Number.values()[j]);
             cards.add(card);
            }
        }

    }

    public Card(Type typeCard, Number number) {
        this.typeCard = typeCard;
        this.number = number;
    }
}

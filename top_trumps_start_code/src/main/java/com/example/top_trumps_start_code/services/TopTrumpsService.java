package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {

//    private ArrayList<Card> cards;

    public String checkWinner(Card card1, Card card2){
        int value1 = card1.getCardValue();
        int value2 = card2.getCardValue();

        if (value1 > value2){
            return card1.getRank() + " of " + card1.getSuit() + " wins!";
        } else if (value2 > value1) {
            return card2.getRank() + " of " + card2.getSuit() + " wins!";
        } else {
            return "It's a draw!";
        }
    }

}

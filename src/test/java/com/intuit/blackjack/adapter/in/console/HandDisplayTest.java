package com.intuit.blackjack.adapter.in.console;

import com.intuit.blackjack.domain.Rank;
import com.intuit.blackjack.domain.Suit;
import com.intuit.blackjack.domain.Card;
import com.intuit.blackjack.domain.Hand;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HandDisplayTest {

    @Test
    public void displayFirstCard() throws Exception {
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.ACE)));

        assertThat(ConsoleHand.displayFirstCard(hand))
                .isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘");
    }

    @Test
    public void cardsAsStringTransformsWholeHand() throws Exception {
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.FIVE),
                                     new Card(Suit.SPADES, Rank.JACK)));

        assertThat(ConsoleHand.cardsAsString(hand))
                .isEqualTo("[31m┌─────────┐[1B[11D│5        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        5│[1B[11D└─────────┘[6A[1C[30m┌─────────┐[1B[11D│J        │[1B[11D│         │[1B[11D│    ♠    │[1B[11D│         │[1B[11D│        J│[1B[11D└─────────┘");
    }

}

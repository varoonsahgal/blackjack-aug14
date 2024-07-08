package com.intuit.blackjack.adapter.in.console;

import com.intuit.blackjack.domain.Rank;
import com.intuit.blackjack.domain.Suit;
import com.intuit.blackjack.domain.Card;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CardDisplayTest {

    @Test
    public void displayTenAsString() throws Exception {
        Card card = new Card(Suit.CLUBS, Rank.TEN);

        assertThat(ConsoleCard.display(card))
                .isEqualTo("[30m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
    }

    @Test
    public void displayNonTenAsString() throws Exception {
        Card card = new Card(Suit.DIAMONDS, Rank.THREE);

        assertThat(ConsoleCard.display(card))
                .isEqualTo("[31m┌─────────┐[1B[11D│3        │[1B[11D│         │[1B[11D│    ♦    │[1B[11D│         │[1B[11D│        3│[1B[11D└─────────┘");
    }

}

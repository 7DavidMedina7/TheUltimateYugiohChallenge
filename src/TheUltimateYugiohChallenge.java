import java.util.Random;

// A program designed to produce a random rule generator for the trading card game of Yu-Gi-Oh!
public class TheUltimateYugiohChallenge {
    public static void main(String[] args) {

        // Creating an instance of the Random class
        Random  random = new Random();

        // Creating the range of the list
        int min = 1;
        int max = 45;

        // Generates random number between 1 through 50
        int number = random.nextInt((max - min) + 1) + min;

        // Switch statement for selection of Yu-Gi-Oh! rule
        switch(number) {
            case 1:
                System.out.println("Shuffle your hand into your deck and then draw that many cards.");
                break;

            case 2:
                System.out.println("Destroy all face-up fusion monsters.");
                break;

            case 3:
                System.out.println("Draw a card from the bottom of your deck.");
                break;

            case 4:
                System.out.println("Destroy all face up synchro monsters.");
                break;

            case 5:
                System.out.println("Swap LP with your opponent.");
                break;

            case 6:
                System.out.println("Shuffle your graveyard into your deck. Then mill the top 15 cards to the graveyard.");
                break;

            case 7:
                System.out.println("Destroy all monsters with 5 or more levels.");
                break;

            case 8:
                System.out.println("Banish all cards in your graveyard.");
                break;

            case 9:
                System.out.println("Destroy all spell and trap cards your opponent controls.");
                break;

            case 10:
                System.out.println("Banish all cards on the field.");
                break;

            case 11:
                System.out.println("If you have less LP than your opponent, special summon one monster from your hand to the field, ignoring summoning conditions.");
                break;

            case 12:
                System.out.println("Turn all monsters face-down; they may not change battle position.");
                break;

            case 13:
                System.out.println("Skip your opponents' next turn.");
                break;

            case 14:
                System.out.println("All monsters become normal monsters with no effects until the end of the turn.");
                break;

            case 15:
                System.out.println("Destroy all face-up XYZ monsters.");
                break;

            case 16:
                System.out.println("Swap the ATK and DEF of all monsters on your opponents' side of the field.");
                break;

            case 17:
                System.out.println("Destroy all monsters with 4 or less levels.");
                break;

            case 18:
                System.out.println("You may not special summon cards for the rest of the turn.");
                break;

            case 19:
                System.out.println("You may only activate one card this turn.");
                break;

            case 20:
                System.out.println("Destroy all monsters on the field.");
                break;

            case 21:
                System.out.println("Draw cards up to the number of cards your opponent controls. At the end phase, banish your entire hand face down.");
                break;

            case 22:
                System.out.println("Your opponent discards a random card from your hand.");
                break;

            case 23:
                System.out.println("All players lose 1500 LP.");
                break;

            case 24:
                System.out.println("Restore your LP back to 8000.");
                break;

            case 25:
                System.out.println("Destroy all link monsters.");
                break;

            case 26:
                System.out.println("Swap a monster with your opponent both of your choice.");
                break;

            case 27:
                System.out.println("Draw two cards.");
                break;

            case 28:
                System.out.println("You cannot attack unless you scream out 'Yu-Gi-Oh!'");
                break;

            case 29:
                System.out.println("You cannot special summon cards from your extra deck for the rest of the turn.");
                break;

            case 30:
                System.out.println("Lose half of your LP.");
                break;

            case 31:
                System.out.println("Card drawn is to be put back at the bottom of the deck.");
                break;

            case 32:
                System.out.println("Lose 500 LP for each spell and trap in the entire field.");
                break;

            case 33:
                System.out.println("All players reveal the top card of their deck. You may play that card immediately, starting with the turn player. Otherwise, keep the card in your hand.");
                break;

            case 34:
                System.out.println("For the rest of the turn, pay 100 LP for each card/effect you activate.");
                break;

            case 35:
                System.out.println("You cannot activate spells or traps for the rest of the turn.");
                break;

            case 36:
                System.out.println("Skip your main phase 1.");
                break;

            case 37:
                System.out.println("Special summon any monster from either player's graveyard ignoring its summoning conditions.");
                break;

            case 38:
                System.out.println("Special summon a token to your side of the field. This token mirror's a monster's ATK, DEF, LEVEL, and EFFECT, from either side of the field.");
                break;

            case 39:
                System.out.println("Make one monster's effect NOT 'once per turn' from your side of the field.");
                break;

            case 40:
                System.out.println("For each monster that attacks directly this turn, banish the top ten cards from your opponent's deck.");
                break;

            case 41:
                System.out.println("Swap hands with your opponent. Send both hands to the graveyard at the end of the turn.");
                break;

            case 42:
                System.out.println("Re-roll the generator.");
                break;

            case 43:
                System.out.println("If you control monsters of the same attribute, destroy all your opponent's monsters.");
                break;

            case 44:
                System.out.println("All of your monsters can attack directly until the end of this turn.");
                break;

            case 45:
                System.out.println("Double the ATK or DEF of all your monsters for the rest of the turn.");
                break;


        }

    }
}

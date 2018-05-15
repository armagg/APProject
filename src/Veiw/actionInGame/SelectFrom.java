package Veiw.actionInGame;

import Models.Cards.Classes.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectFrom {
    private Scanner scanner = new Scanner(System.in);

    public List<Integer> whichNumbers(int numbers) {
        List<Integer> list = new ArrayList<>(numbers);
        for (int i = 0; i < numbers; i++) {
            list.add(scanner.nextInt() - 1);
        }
        return list;
    }

    public void showCards(List<Card> cards) {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(String.valueOf(i + 1) + ": " + cards.get(i).getName());
        }
    }


}

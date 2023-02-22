package adventure_game.items;

import adventure_game.Character;

public interface Consumable {
    public void consume(Character owner, Character other);
}

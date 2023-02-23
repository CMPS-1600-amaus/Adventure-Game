package adventure_game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CharacterTests{

    private Character c;
    @BeforeEach
    void setup(){
        c = new Player("Hero", 100, 9, 7, "The hero");
    }

    @Test
    void testModifyHealth(){
        assertTrue(c.getHealth() == 100);
        c.modifyHealth(-10);
        assertTrue(c.getHealth() == 90);
    }
}
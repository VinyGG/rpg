package br.com.viny.rpg.skills;

import br.com.viny.rpg.main.Fight;
import br.com.viny.rpg.main.Player;
import java.util.Random;

public class DoubleAttack {

    Random rd = new Random();
    Fight fight = new Fight();
    
    public void execute(Player p1, Player p2) {
        fight.attack(p1, p2);
        fight.attack(p1, p2);
    }

}

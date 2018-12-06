/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import statistics.Player;

/**
 *
 * @author ajhaarni
 */
public class Not implements Matcher {
    private Matcher param;

    public Not(Matcher param) {
        this.param = param;
    }

    @Override
    public boolean matches(Player p) {
        return !param.matches(p);
    }
    
    
}

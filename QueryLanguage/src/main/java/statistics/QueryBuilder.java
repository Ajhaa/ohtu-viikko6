/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import statistics.matcher.All;
import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.Not;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

/**
 *
 * @author ajhaarni
 */
public class QueryBuilder {
    Matcher matcher;

    public QueryBuilder() {
        matcher = new All();
    }
    
    public Matcher build() {
        Matcher built = matcher;
        matcher = new All();
        return built;
    }
    
    public QueryBuilder hasAtLeast(int value, String field) {
        this.matcher = new And(this.matcher, new HasAtLeast(value, field));
        return this;
    }
    
    public QueryBuilder hasFewerThan(int value, String field) {
        this.matcher = new And(this.matcher, new HasFewerThan(value, field));
        return this;
    }
    
    public QueryBuilder playsIn(String team) {
        this.matcher = new And(this.matcher, new PlaysIn(team));
        return this;
    }
    
    public QueryBuilder oneOf(Matcher... matchers) {
        this.matcher = new And(this.matcher, new Or(matchers));
        return this;
    }
    
    public QueryBuilder not(Matcher matcher) {
        this.matcher = new And(this.matcher, new Not(matcher));
        return this;
    }
    
}

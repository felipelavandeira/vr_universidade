package com.lavandeira.vr_universidade.model.enumerated;

/**
 *
 * @author felipelavandeira
 */
public enum Period {
    
    MATUTINO("Matutino"),
    VESPERTINO("Vespertino"), 
    NOTURNO("Noturno"),
    INTEGRAL("Integral");
    
    String description;

    private Period(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}

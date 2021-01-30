package com.lavandeira.vr_universidade.model.enumerated;

/**
 *
 * @author felipelavandeira
 */
public enum Title {
    
    ME("Mestre", "Prof. Me."),
    DR("Doutor", "Prof. Dr."),
    BAC("Bacharel", "Prof.");
    
    String description;
    String initials;

    private Title(String description, String initials) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getInitials() {
        return initials;
    }
    
}

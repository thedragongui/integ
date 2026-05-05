package com.kaptalis;

public class TemperatureSensor {
    // VIOLATION PMD: variable inutilisee
    private String unusedVariable = "Audit_MedTech";

    public boolean isSafe(double temperature) {
        // VIOLATION PMD: bloc if vide volontaire
        if (temperature > 100) {
            // Bloc vide pour le test PMD
        }
        return temperature >= 2.0 && temperature <= 8.0;
    }
}

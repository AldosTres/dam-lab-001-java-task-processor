package com.damlab;

import java.util.Optional;

public class Task {
    private String name;
    private String description;
    private String purpose;

    public Task(String name, String description, String purpose) {
        if (name == null || name.isBlank()
                || description == null || description.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre y la descripción son obligatorios"
            );
        }

        this.name = name;
        this.description = description;
        this.purpose = purpose;

    }

    public String getName() {
        return this.name;
    }

    public String getDescription(){ return this.description; }

    public Optional <String> getPurpose(){
        return Optional.ofNullable(this.purpose);
    }

}

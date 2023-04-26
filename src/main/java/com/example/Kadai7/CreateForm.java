package com.example.Kadai7;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateForm {

    @NotBlank()
    @Size(min = 1, max = 20)
    private String name;


    //名前
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

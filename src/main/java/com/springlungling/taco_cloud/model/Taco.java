package com.springlungling.taco_cloud.model;

import lombok.Data;
import java.util.List;

@Data
public class Taco {
    private String name;

    List <Ingredient> ingredients;
}

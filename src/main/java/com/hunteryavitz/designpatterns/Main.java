package com.hunteryavitz.designpatterns;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Main {

    @GetMapping("/nutrition-label")
    public ResponseEntity<NutritionalLabel> buildNutritionLabel() {

        return ResponseEntity.ok(createNutritionLabel());
    }

    @GetMapping("/pizza-item/ny-pizza")
    public ResponseEntity<NyPizza> buildNYPizzaItem() {

        return ResponseEntity.ok(createNYPizzaItem());
    }

    @GetMapping("/pizza-item/calzone")
    public ResponseEntity<Calzone> buildCalzoneItem() {

        return ResponseEntity.ok(createCalzoneItem());
    }

    private NutritionalLabel createNutritionLabel() {
        return new NutritionalLabel.Builder(10, 2)
                .calories(100)
                .fat(50)
                .sodium(25)
                .carbohydrates(20)
                .build();
    }

    private NyPizza createNYPizzaItem() {
        return new NyPizza.Builder(NyPizza.Size.LARGE)
                .addTopping(PizzaItem.Topping.PEPPERONI)
                .addTopping(PizzaItem.Topping.SAUSAGE)
                .addTopping(PizzaItem.Topping.MUSHROOM)
                .addTopping(PizzaItem.Topping.ONION)
                .addTopping(PizzaItem.Topping.BACON)
                .addTopping(PizzaItem.Topping.EXTRA_CHEESE)
                .addTopping(PizzaItem.Topping.BLACK_OLIVES)
                .addTopping(PizzaItem.Topping.GREEN_PEPPERS)
                .addTopping(PizzaItem.Topping.PINEAPPLE)
                .addTopping(PizzaItem.Topping.SPINACH)
                .build();
    }

    private Calzone createCalzoneItem() {
        return new Calzone.Builder(true)
                .addTopping(PizzaItem.Topping.PEPPERONI)
                .addTopping(PizzaItem.Topping.SAUSAGE)
                .addTopping(PizzaItem.Topping.MUSHROOM)
                .addTopping(PizzaItem.Topping.ONION)
                .addTopping(PizzaItem.Topping.BACON)
                .addTopping(PizzaItem.Topping.EXTRA_CHEESE)
                .addTopping(PizzaItem.Topping.BLACK_OLIVES)
                .addTopping(PizzaItem.Topping.GREEN_PEPPERS)
                .addTopping(PizzaItem.Topping.PINEAPPLE)
                .addTopping(PizzaItem.Topping.SPINACH)
                .build();
    }
}

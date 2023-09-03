package com.hunteryavitz.designpatterns;

import lombok.Data;

@Data
public class NutritionalLabel {

    private final int servingSize;
    private final int servings;

    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrates;

    public static class Builder {

        // required
        private final int servingSize;
        private final int servings;

        // optional
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrates;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;

            this.calories = 0;
            this.fat = 0;
            this.sodium = 0;
            this.carbohydrates = 0;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrates(int val) {
            carbohydrates = val;
            return this;
        }

        public NutritionalLabel build() {
            return new NutritionalLabel(this);
        }
    }

    private NutritionalLabel (Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;

        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrates = builder.carbohydrates;
    }
}

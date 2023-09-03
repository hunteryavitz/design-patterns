package com.hunteryavitz.designpatterns;

import lombok.Data;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

@Data
public abstract class PizzaItem {
    public enum Topping {
        PEPPERONI, SAUSAGE, MUSHROOM, ONION, BACON, EXTRA_CHEESE, BLACK_OLIVES, GREEN_PEPPERS, PINEAPPLE, SPINACH
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract PizzaItem build();

        protected abstract T self();
    }

    PizzaItem(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}

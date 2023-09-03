package com.hunteryavitz.designpatterns;

public class Calzone extends PizzaItem {

    public static class Builder extends PizzaItem.Builder<Builder> {
        private final boolean sauceInside;

        public Builder(boolean sauceInside) {
            this.sauceInside = sauceInside;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        boolean sauceInside = builder.sauceInside;
    }

}

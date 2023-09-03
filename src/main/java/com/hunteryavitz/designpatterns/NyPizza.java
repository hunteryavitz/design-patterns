package com.hunteryavitz.designpatterns;

public class NyPizza extends PizzaItem {

    public enum Size { SMALL, MEDIUM, LARGE }

    public static class Builder extends PizzaItem.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        Size size = builder.size;
    }
}

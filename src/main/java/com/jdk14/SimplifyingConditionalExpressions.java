package com.jdk14;

public class SimplifyingConditionalExpressions {

    public static void main(String[] args) {
        double price = 202.47;
        Monitor m = new Monitor("Audi", price);
        Monitor m1 = new Monitor("Audi", price);
        price = 212.47;
        Monitor m2 = new Monitor("Audi", price);
        System.out.println(m.equals(m1));
        System.out.println(m.equals(m2));
    }

    record Monitor(String model, double price) {

        public Monitor(String model, double price) {
            this.model = model;
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {

            /**
             * Simplifying conditional expressions
             * **/
            return o instanceof Monitor input &&
                    (model.equals(input.model) && price == input.price);

        /*return (o instanceof Monitor input) &&
                (model.equals(input.model) && price == input.price);*/

        /*return (o instanceof Monitor input) ?
                (model.equals(input.model) && price == input.price) : false;*/

            /**
             * Older Code
             * **/
        /*if(o instanceof Monitor) {
            Monitor other = (Monitor) o;
            if(model.equals(other.model) && price == other.price) {
                return true;
            }
        }*/
            /**
             * Newer Code
             * **/
        /*if(o instanceof Monitor input) {
            System.out.println("equals called=====");
            if(model.equals(input.model) && price == input.price) {
                return true;
            }
        }
        return false;*/
        }
    }

}

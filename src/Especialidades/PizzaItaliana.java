package Especialidades;

import Base.Pizza;
import Base.Topping;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public PizzaItaliana(String name, double price, String salsa, Topping... toppings) {
        super(name, price, toppings);
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }
}

import Base.Pizza;
import Base.Topping;
import Especialidades.PizzaItaliana;
import Interfaces.PizzaBase;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Pizza Margherita", 19.99);
        pizza.addTopping(new Topping("Tomato",6.55));
        pizza.addTopping(new Topping("Mozzarella",4));
        pizza.addTopping(new Topping("Basil",3));
        pizza.prepare();

        PizzaItaliana italiana = new PizzaItaliana("Pizza Italiana", 21.99, "Tomato Sauce");
        italiana.addTopping(new Topping("Tomato",10));
        italiana.addTopping(new Topping("Mozzarella",5));
        italiana.addTopping(new Topping("Albahaca",2));
        //italiana.prepare();
        System.out.println("Salsa de la pizza italiana: " + italiana.getSalsa());
        System.out.println(pizza.getToppingsList());

        PizzaBase pizzaBase = new PizzaBase("Pizza Base", 9.99);
        pizzaBase.prepare();



    }
}

package Factory;

public class ChicagoPizzaStore  extends  PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        switch(type){
            case "Cheese": return new ChicagostyleCheesePizza();
            case "Pepperoni": return new ChicagostylePepperoniPizza();
            default: return null;
        }
    }
}

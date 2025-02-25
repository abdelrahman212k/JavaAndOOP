package oopBasics;

public class Constructors {
    // Attributes
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;

    // Constructors
    /*Empty constructor: if you defined a parametrized constructor you must define an empty constructor if you want to use
      the language doesn't define an empty constructor for you if you already defined a parametrized constructor */

    //Empty constructor
    public Constructors(){

    }

    // Parametrized constructor
    public Constructors(String name, String description, float price, int quantity, float discount){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Constructors(String name, String description, float price, int quantity, float discount, String color){
        // Constructor chaining: where this constructor is calling another constructor in the same class
        this(name, description, price, quantity, discount);
        this.color = color;
    }

    // Copy constructor: copy the value of another object of the same class
    public Constructors(Constructors obj){
        this.name = obj.name;
        this.description = obj.description;
        this.price = obj.price;
        this.quantity = obj.quantity;
        this.discount = obj.discount;
        this.color = obj.color;
    }
}

public class Animal implements Organism {
    // Keep variables private so ensure encapsulation    
    private Integer weight;
    private String type;
    private String size;

    public Animal(Integer weight, String type) {
        this.weight = weight;
        this.type = type;
    }


    public poop() {

    }

    public eat() {

    }

    public sleep() {

    }

    // Getters and Setters should be the only accessors and mutators for your class
    public getWeight() {
        return this.weight;
    }
    
    public setWeight(Integer weight) {
        this.weight = weight;
    }
    
    public getType() {
        return this.type;
    }
    
    public setType(String type) {
        this.type = type;
    }
    
    public getSize() {
        return this.size;
    }
    
    public setSize(String size) {
        this.size = size;
    }

    public toString() {
        System.out.println("Weight: " + this.weight + ", Size: " + this.size + ", Type: " + this.type)
    }

}

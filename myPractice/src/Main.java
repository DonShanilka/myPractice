import java.util.PrimitiveIterator;

class Animal {
    private String name;
    private String colour;
    private String catagary;
    private String age;

    public Animal(String name, String colour, String catagary, String age){
        this.name = name;
        this.colour = colour;
        this.catagary = catagary;
        this.age = age;
    }

    public String go(){
        return "go";
    }

    public int go(){
        return 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCatagary() {
        return catagary;
    }

    public void setCatagary(String catagary) {
        this.catagary = catagary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = '" + name + '\'' +
                ", colour = '" + colour + '\'' +
                ", catagary = '" + catagary + '\'' +
                ", age = '" + age + '\'' +
                '}';
    }
}

class Doge extends Animal{
    public Doge(String name, String colour, String catagary, String age){
        super(name, colour, catagary, age);
    }
}

class Main {
    public static void main(String[] args) {
        Doge doge = new Doge("Sithira", "Black", "Doge", "10");
        System.out.println(doge);
    }
}


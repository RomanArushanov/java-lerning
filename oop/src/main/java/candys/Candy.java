package candys;

import java.util.Objects;

public abstract class Candy {
    private String name;
    private int price;
    private int weight;

    public Candy(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Candy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", price=" + price +
                ", weight=" + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return price == candy.price && weight == candy.weight && Objects.equals(name, candy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }
}

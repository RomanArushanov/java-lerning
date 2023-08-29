package candys;

import interfaces.Present;

public class JellyCandy extends Candy implements Present {
    private String jellyType;

    public JellyCandy(String name, int price, int weight, String jellyType) {
        super(name, price, weight);
        this.jellyType = jellyType;
    }

    public JellyCandy() {
    }

    public String getJellyType() {
        return jellyType;
    }

    public void setJellyType(String jellyType) {
        this.jellyType = jellyType;
    }

    @Override
    public String toString() {
        return "JellyCandy: " +
                "jellyType=" + jellyType +
                ", " + super.toString();
    }

    @Override
    public Candy buyPresent() {
        String[] nameJellyCandy = {"Аленка","Баварская","Ротфронт"};
        String[] typeJelly = {"Молочное желе","Фкрутовое желе","Ягодное желе"};

        return new JellyCandy(nameJellyCandy[(int) (Math.random() * nameJellyCandy.length)],
                (int) (Math.random() * 200 + 150),
                (int) (Math.random() * 200 + 100),
                typeJelly[(int) (Math.random() * typeJelly.length)]);
    }
}
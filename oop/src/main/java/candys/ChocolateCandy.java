package candys;

import interfaces.Present;

public class ChocolateCandy extends Candy implements Present {
    private String chocolateType;

    public ChocolateCandy(String name, int price, int weight, String chocolateType) {
        super(name, price, weight);
        this.chocolateType = chocolateType;
    }

    public ChocolateCandy() {
    }

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public String toString() {
        return "ChocolateCandy: " +
                "chocolateType=" + chocolateType +
                ", " + super.toString();
    }

    @Override
    public Candy buyPresent() {
        String[] nameChocolateCandy = {"Аленка","Баварская","Ротфронт",""};
        String[] typeChocolate = {"Белый шоколад","Черный шоколад","Красный шоколад",""};

        return new ChocolateCandy(nameChocolateCandy[(int) (Math.random() * nameChocolateCandy.length - 1)],
                (int) (Math.random() * 200 + 150),
                (int) (Math.random() * 200 + 100),
                typeChocolate[(int) (Math.random() * typeChocolate.length - 1)]);
    }
}

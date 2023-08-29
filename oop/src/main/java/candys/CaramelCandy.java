package candys;

import interfaces.Present;

public class CaramelCandy extends Candy implements Present {
    private String caramelType;

    public CaramelCandy(String name, int price, int weight, String caramelType) {
        super(name, price, weight);
        this.caramelType = caramelType;
    }

    public CaramelCandy() {
    }

    public String getCaramelType() {
        return caramelType;
    }

    public void setCaramelType(String caramelType) {
        this.caramelType = caramelType;
    }

    @Override
    public String toString() {
        return "CaramelCandy: " +
                "caramelType=" + caramelType +
                ", " + super.toString();
    }

    @Override
    public Candy buyPresent() {
        String[] nameCaramelCandy = {"Аленка","Баварская","Ротфронт",""};
        String[] typeCaramel = {"Глазированная карамель","Карамель с фруктовой начинкой","Соленая карамель",""};

        return new CaramelCandy(nameCaramelCandy[(int) (Math.random() * nameCaramelCandy.length - 1)],
                (int) (Math.random() * 200 + 150),
                (int) (Math.random() * 200 + 100),
                typeCaramel[(int) (Math.random() * typeCaramel.length - 1)]);
    }
}

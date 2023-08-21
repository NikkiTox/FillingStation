public class Main {
    public static void main(String[] args) {
        System.out.println("—истема расчета стоимости топлива");

        int fuelType = 92;
        int amount = 420;
        int maxAmount = 400;
        boolean hasDiscount = amount > 10;
        double fuel92price = 60.2;
        double fuel95price = 67.33;
        double discount = 0.1;
        String wrongFuelTypeMessage = "”казан неверный тип топлива";

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelPrice = fuelPrice - discount * fuelPrice;
        }
        if (amount < 1) {
            System.out.println("”казано слишком малое количество топлива");
            amount = 0;
        }
        if (amount > maxAmount) {
            System.out.println("”казанное количество топлива превышает максимально допустимое");
        }
        String fuelPriceMessage = "÷ена выбранного топлива: " + fuelPrice + " руб.";
        System.out.println(fuelPriceMessage);
        double totalPrice = fuelPrice * amount;
        System.out.println("ќбща€ стоимость заправки: " + totalPrice + " руб.");
    }
}

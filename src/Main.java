public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        // Переменная типа бензина
        int fuelType = 92;
        // Переменная колличества
        int amount = 420;
        // Допустимое количество
        int maxAmount = 400;
        // Наличие скидки
        boolean hasDiscount = amount > 10;
        // Стоимость топлива АИ-92
        double fuel92price = 60.2;
        // Стоимость топлива АИ-95
        double fuel95price = 67.33;

        double discount = 0.1;
        String wrongFuelTypeMessage = "Указан неверный тип топлива";

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
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }
        if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
        }
        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";
        System.out.println(fuelPriceMessage);
        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}

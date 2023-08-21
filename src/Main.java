public class Main {
    public static void main(String[] args) {
        System.out.println("������� ������� ��������� �������");

        // ���������� ���� �������
        int fuelType = 92;
        // ���������� �����������
        int amount = 420;
        // ���������� ����������
        int maxAmount = 400;
        // ������� ������
        boolean hasDiscount = amount > 10;
        // ��������� ������� ��-92
        double fuel92price = 60.2;
        // ��������� ������� ��-95
        double fuel95price = 67.33;

        double discount = 0.1;
        String wrongFuelTypeMessage = "������ �������� ��� �������";

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
            System.out.println("������� ������� ����� ���������� �������");
            amount = 0;
        }
        if (amount > maxAmount) {
            System.out.println("��������� ���������� ������� ��������� ����������� ����������");
        }
        String fuelPriceMessage = "���� ���������� �������: " + fuelPrice + " ���.";
        System.out.println(fuelPriceMessage);
        double totalPrice = fuelPrice * amount;
        System.out.println("����� ��������� ��������: " + totalPrice + " ���.");
    }
}

import java.util.Scanner;

class Phone {
    String model;
    double price;

    Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }
}

 class PhoneSale {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        Phone[] phones = {
                new Phone("iPhone 15", 999.99),
                new Phone("Samsung Galaxy S24", 899.99),
                new Phone("Google Pixel 8", 799.99)
        };

        System.out.println("📱 Welcome to Mobile Store!");
        System.out.println("----------------------------");
        System.out.println("Available Phones:");
        for (int i = 0; i < phones.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, phones[i].model, phones[i].price);
        }

        System.out.print("Enter the number of the phone you want to buy: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= phones.length) {
            Phone selectedPhone = phones[choice - 1];
            System.out.printf("You selected: %s. Price: $%.2f%n", selectedPhone.model, selectedPhone.price);
            System.out.print("Enter payment amount: $");
            double payment = scanner.nextDouble();

            if (payment >= selectedPhone.price) {
                double change = payment - selectedPhone.price;
                System.out.printf("✅ Payment successful! Your change: $%.2f%n", change);
            } else {
                System.out.println("❌ Insufficient payment. Transaction failed.");
            }
        } else {
            System.out.println("❌ Invalid selection.");
        }

        scanner.close();
    }
}
public class Main {
    public static void main(String[] args) {
            CreditService service = new CreditService();
            int monthPayOneYear = service.calculate(1_000_000, 1, 9.99);
            System.out.println("Ежемесячный платёж, срок 1 год " + monthPayOneYear + "рублей");
            int monthPayTwoYear = service.calculate(1_000_000, 2, 9.99);
            System.out.println("Ежемесячный платёж, срок 2 года " + monthPayTwoYear + "рублей");
            int monthPayTreeYear = service.calculate(1_000_000, 2, 9.99);
            System.out.println("Ежемесячный платёж, срок 3 года " + monthPayTreeYear + "рублей");
        }
}

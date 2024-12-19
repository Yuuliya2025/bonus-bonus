public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonusForRegisteredUser = service.calculate(19253, true);
        System.out.println("Бонус для зарегистрированного пользователя: " + bonusForRegisteredUser);

        long bonusForUnregisteredUser = service.calculate(25379, false);
        System.out.println("Бонус для незарегистрированного пользователя: " + bonusForUnregisteredUser);
    }
}








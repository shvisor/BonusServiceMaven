public class BonusService {
    /**
     * При пополнении счета клиент получает бонус в размере 3% (если зарегистрирован) или 1% (если не зарегистрирован). Максимальный бонус 500.
     * @param amount сумма пополнения
     * @param registered наличие регистрации
     * @return количество бонусов
     */
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
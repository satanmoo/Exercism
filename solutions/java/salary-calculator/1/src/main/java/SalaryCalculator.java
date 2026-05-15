public class SalaryCalculator {
    private static final double BASE_SALARY = 1000.0;
    private static final double SALARY_CAP = 2000.0;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        var base = BASE_SALARY * salaryMultiplier(daysSkipped);
        var bonus = bonusForProductsSold(productsSold);
        var total = base + bonus;

        return total > SALARY_CAP ? SALARY_CAP : total;
    }
}

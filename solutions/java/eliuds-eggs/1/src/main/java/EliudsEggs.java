final public class EliudsEggs {
    public int eggCount(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 2;
            number = number / 2;
        }

        return result;
    }
}

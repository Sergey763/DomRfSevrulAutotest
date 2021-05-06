package generator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {
    private Random index = new Random();

    private final List<String> maleNames = Arrays.asList("Антон", "Борис", "Владимир", "Глеб", "Никита", "Жаб", "Александр", "Конор", "Хабиб", "Стивен",
            "Цветомир", "Сергей", "Юлий", "Бил", "Забав", "Джеки", "Базар", "Прайс", "Эдуард", "Марк", "Михаэль", "Ральф");


    public String getMil() {
        String number = Integer.toString(index.nextInt(999999) + 100000);
        return "ulala".concat("+").concat(number).concat("@mail.com");
    }

    public String getPhone() {
        String number = Integer.toString(index.nextInt(9999999) + 1000000);
        return "927".concat(number);

    }
}


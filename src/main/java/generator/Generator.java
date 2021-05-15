package generator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {
    private Random index = new Random();

    private final List<String> maleFirstNames = Arrays.asList("Антон", "Борис", "Владимир", "Глеб", "Никита", "Жаб", "Александр", "Конор", "Хабиб", "Стивен",
            "Цветомир", "Сергей", "Юлий", "Бил", "Забав", "Джеки", "Базар", "Прайс", "Эдуард", "Марк", "Михаэль", "Ральф","Бенджамин","Алишер", "Агат", "Демид","Клим","Лука","Крситиано","Леонель");

    private final List<String> maleLastNames = Arrays.asList("Гейтс", "Джобс", "", "Глеб", "Никита", "Жаб", "Александр", "Конор", "Хабиб", "Стивен",
            "Цветомир", "Сергей", "Юлий", "Бил", "Забав", "Джеки", "Базар", "Прайс", "Эдуард", "Марк", "Михаэль", "Ральф","Бенджамин","Алишер", "Агат", "Демид","Клим","Лука","Крситиано","Леонель");

    private final List<String> maleMiddleNames = Arrays.asList("Антон", "Борис", "Владимир", "Глеб", "Никита", "Жаб", "Александр", "Конор", "Хабиб", "Стивен",
            "Цветомир", "Сергей", "Юлий", "Бил", "Забав", "Джеки", "Базар", "Прайс", "Эдуард", "Марк", "Михаэль", "Ральф","Бенджамин","Алишер", "Агат", "Демид","Клим","Лука","Крситиано","Леонель");

    public String getFirstName() {
        String number = Integer.toString(index.nextInt(9999999) + 1000000);
        return "927".concat(number);
    }
    public String getLastName() {
        String number = Integer.toString(index.nextInt(9999999) + 1000000);
        return "927".concat(number);
    }

    public String getMiddleName() {
        String number = Integer.toString(index.nextInt(9999999) + 1000000);
        return "927".concat(number);
    }

    public String getPhone() {
        String number = Integer.toString(index.nextInt(9999999) + 1000000);
        return "927".concat(number);
    }
    public String getMil() {
        String number = Integer.toString(index.nextInt(999999) + 100000);
        return "ulala".concat(number).concat("@mail.com");
    }

    public String getCodeWords() {
        String number = Integer.toString(index.nextInt(9999999) + 1000000);
        return "927".concat(number);
    }
    public String getNumber() {
        String number = Integer.toString(index.nextInt(9999999) + 1000000);
        return "927".concat(number);
    }

    public String getDateBirthday() {
        int day1 = index.nextInt(30)+1;
        int day2 = 10;
        String day;
        if(day1<day2){
            String number = Integer.toString(day1);
            day = "0"+number;
        } else{
            day = Integer.toString(day1);
        }

        int number1 = index.nextInt(12)+1;
        int number2 = 10;
        String mouth;
        if(number1<number2){
            String number = Integer.toString(number1);
            mouth = "0"+number;
        } else{
            mouth = Integer.toString(number1);
        }
        String yaear = Integer.toString(1920 + index.nextInt(60));
        return day.concat(mouth).concat(yaear);
    }
    public String getDatePasport() {
        String day = Integer.toString(index.nextInt(30));
        int number1 = index.nextInt(12)+1;
        int number2 = 10;
        String mouth;
        if(number1<number2){
            String number = Integer.toString(number1);
            mouth = "0"+number;
        } else{
            mouth = Integer.toString(number1);
        }

        String yaear = Integer.toString(1970 + index.nextInt(50));
        return day.concat(mouth).concat(yaear);
    }

    public String getNameDeveloper() {
        String number = Integer.toString(index.nextInt(9999999) + 1000000);
        return "927".concat(number);
    }

}


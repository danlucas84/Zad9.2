import java.sql.SQLOutput;

public class SummingDigitsMethodTest {


    public static void main(String[] args) {


        int originalNumber = 337;
        System.out.println("orginalna liczba wynosi:" + originalNumber);
        int sumOfDigitsOrginalNumber = Digits.getSumOfDigits(originalNumber);
        System.out.println("Podaj sume wszystkich cyfr skłajacych sie na liczbe:" + sumOfDigitsOrginalNumber);
    }
}

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Vasilevich";
        String lastName = "Grozniy";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника - " + fullName);
        System.out.println("ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        String fullName2 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName2.replace("ё", "е")
                .replace("Ё", "Е"));
//  ------------------------------------------------------------------------------------------

        String firstName3 = "Dima";
        String middleName3 = "Vasilevich";
        String lastName3 = "Ivanovich";

        String fullName3 = lastName3 + " " + firstName3 + " " + middleName3;
        String fullName3LowerCase = fullName3.toLowerCase();
        System.out.println(fullName3LowerCase);
        String[] fullName3Array = fullName3LowerCase.split(" ");
        System.out.println(Arrays.toString(fullName3Array));

        String[] fullNameCapitalized = new String[3];
        for (int i = 0; i < fullName3Array.length; i++) {
            String namePart = fullName3Array[i];
            String capitalizedString = Character.toUpperCase(namePart.charAt(0)) + namePart.substring(1);
            fullNameCapitalized[i] = capitalizedString;
        }

        String fullNameCapitalizedString = String.join(" ", fullNameCapitalized);
        System.out.println(fullNameCapitalizedString);

    }
}

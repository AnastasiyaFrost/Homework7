public class Main {
    public static void main(String[] args) {
        //Task 1
        String firstName = "Иван ";
        String middleName = "Иванович ";
        String lastName = "Иванов ";
        String fullName = firstName+middleName+lastName;
        System.out.println("ФИО сотрудника: " + fullName);

        //Task 2

        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("ФИО сотрудника для документов: " + fullNameUpperCase);

        //Task 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё','е');
        System.out.println(fullName);
    }
}
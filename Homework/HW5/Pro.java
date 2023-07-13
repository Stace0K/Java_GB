package Homework.HW5;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Pro {

    public static void main(String[] args) {

        // Подготовим список контактов
        String[] contacts = {
                "+7906114994 Кузнецов Роман Львович",
                "+7499961435 Игнатьева Полина Алексеевна",
                "+7906831540 Максимов Фёдор Михайлович",
                "+7906307360 Черных Максим Евгеньевич",
                "+7495173360 Федоров Степан Анатольевич",
                "+7495802455 Платонов Вячеслав Матвеевич",
                "+7495556567 Воронина Анастасия Дмитриевна",
                "+7499091897 Максимов Тимур Ильич",
                "+7499822925 Воронина Марта Олеговна",
                "+7499195812 Зотов Павел Арсентьевич",
                "+7495198818 Кузнецов Максим Максимович",
                "+7499634157 Балашова Амелия Евгеньевна",
                "+7906533865 Филиппова Алёна Константиновна",
                "+7906484656 Кузина Дарья Данииловна",
                "+7906428123 Воронина Милана Юрьевна",
        };


        Phonebook phonebook = new Phonebook(contacts);

        System.out.println("*** Поиск контактов ***\n");

        System.out.println("***Ключевое слово для поиска: \"онина\" ***\n");
        generateSearchRequest(phonebook, "онина");

        System.out.println("\n***Ключевое слово для поиска: \"ов\" ***\n");
        generateSearchRequest(phonebook, "ов");

    }


    /**
     * Метод создает запрос на поиск контакта в телефонном справочнике и выводит результат поиска
     * @param phonebook - телефонный справочник
     * @param surname - фамилия
     */
    private static void generateSearchRequest(Phonebook phonebook, String surname){

        ArrayList<Contact> contacts = phonebook.get(surname);
        for (Contact contact: contacts) {
            System.out.printf("%s\t\t%s\n", contact.getPhone(), contact.getSurname());
        }
    }

}

/**
 * Телефонный справочник
 */
class Phonebook{

    /**
     * Споисок контактов
     * Key - уникальный номер телефона
     * Value - контакт (фамилия в контакте может повторяться)
     */
    private final HashMap<String, Contact> contacts = new HashMap<>();

    public Phonebook(String[] contacts)
    {
        for (String contact: contacts) {
            String[] parts = contact.split(" ");
            add(parts[0], parts[1]);
        }
    }

    /**
     * Добавить новый контакт в телефонный справочник
     * @param phone - номер телефона
     * @param surname - фамилия
     * @return результат добавления
     */
    public boolean add(String phone, String surname){
        if (contacts.containsKey(phone))
            return false;
        else
            contacts.put(phone, new Contact(phone, surname));
        return true;
    }

    /**
     * Поиск контактов в телефонном справочнике по ключевому слову
     * @param search - ключевое слово
     * @return - результат поиска
     */
    public ArrayList<Contact> get(String search){
        ArrayList<Contact> searchResult = new ArrayList<>();
        for(Map.Entry<String, Contact> contact : contacts.entrySet())
            if (contact.getValue().getSurname().toLowerCase().contains(search.toLowerCase()))
                searchResult.add(contact.getValue());
        return searchResult;
    }
}

/**
 * Телефонный контакт
 */
class Contact{

    private final String surname;
    private final String phone;

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public Contact(String phone, String surname) {
        this.surname = surname;
        this.phone = phone;
    }

}


import java.util.*;


public class PhoneBook {
    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }


    public void add(Record record) {
        records.add(record);
    }


    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equalsIgnoreCase(name)) {
                return record;
            }
        }
        return null;
    }


    public List<Record> findAll(String name) {
        List<Record> matchingRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equalsIgnoreCase(name)) {
                matchingRecords.add(record);
            }
        }
        return matchingRecords.isEmpty() ? null : matchingRecords;
    }

    @Override
    public String toString() {
        return "PhoneBook{" + "records=" + records + '}';
    }

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add(new Record("John Doe", "123-456-7890"));
        phoneBook.add(new Record("Jane Doe", "987-654-3210"));
        phoneBook.add(new Record("John Doe", "555-555-5555"));


        System.out.println("Find 'John Doe': " + phoneBook.find("John Doe"));


        System.out.println("FindAll 'John Doe': " + phoneBook.findAll("John Doe"));


        System.out.println(phoneBook);
    }
}

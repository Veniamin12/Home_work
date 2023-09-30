package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phone_Directory {
    private List<Record> recordList;

    public Phone_Directory() {
        recordList = new ArrayList<>();
    }

    public void add(Record record) {
        recordList.add(record);
    }

    public Record find(String name) {
        for (Record record : recordList) {
            if (record.getName().equalsIgnoreCase(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> listRecords = new ArrayList<>();
        for (Record record : recordList) {
            if (record.getName().equalsIgnoreCase(name)) {
                listRecords.add(record);
            }
        }
        if (listRecords.isEmpty()) {
            return null;
        } else {
            return listRecords;
        }
    }
}

package hashtable.chaining;

public class MyChainingHashTable {

    public ChainingSlot[] hashTable;

    public MyChainingHashTable(Integer size) {
        this.hashTable = new ChainingSlot[size];
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);

        if (this.hashTable[address] != null) {
            ChainingSlot findSlot = this.hashTable[address];
            ChainingSlot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new ChainingSlot(key, value);

        } else {
            this.hashTable[address] = new ChainingSlot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            ChainingSlot findSlot = this.hashTable[address];

            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;

        } else {
            return null;
        }
    }
}

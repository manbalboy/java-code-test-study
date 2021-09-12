package hashtable.chaining;

public class ChainingSlot {
    String key;
    String value;
    ChainingSlot next;

    public ChainingSlot(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

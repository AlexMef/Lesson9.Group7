public interface CustomArrayInterface {
    void addItem(int item);
    void addItem(int item, int index);
    Integer getItem(int index);
    Integer getSize();
    void removeItem(int index);
    void removeAllItems();
    boolean isAtArray(int item);
    Object getCopy();
    int getFirstIndexOf(int item);
    int getLastIndexOf(int item);
    boolean equals(Object o);
    String toString();
}

public class Main {
    public static void main(String[] args) {
        CustomArray array = new CustomArray();
        array.addItem(1);
        array.addItem(8);
        array.addItem(25);
        array.addItem(83);
        array.addItem(1);
        array.addItem(25);
        array.addItem(35, 3);
        System.out.println(array.getItem(0));
        System.out.println(array.toString());
        System.out.println(array.getFirstIndexOf(25));
        System.out.println(array.getLastIndexOf(25));
        array.removeItem(3);
        System.out.println(array.toString());
        System.out.println(array.isAtArray(83));
        array.removeAllItems();
        System.out.println(array.toString());
        System.out.println(array.isAtArray(83));
    }
}

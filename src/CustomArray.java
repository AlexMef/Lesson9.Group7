import java.util.ArrayList;

public class CustomArray implements CustomArrayInterface {
    ArrayList<Integer> arrayList;

    CustomArray() {
        arrayList = new ArrayList<>();
    }


    @Override
    public void addItem(int item) {
        arrayList.add(item);
    }

    @Override
    public void addItem(int item, int index) {
        arrayList.add(index, item);
    }

    @Override
    public Integer getItem(int index) {
        return arrayList.get(index);
    }

    @Override
    public Integer getSize() {
        return arrayList.size() - 1;
    }

    @Override
    public void removeItem(int index) {
        arrayList.remove(index);
    }

    @Override
    public void removeAllItems() {
        for (int i = getSize(); i >= 0; i--){
            arrayList.remove(i);
        }
    }

    @Override
    public boolean isAtArray(int item) {
        for (int i = 0; i < getSize(); i++){
            if (item == arrayList.get(i)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getCopy() {
        return arrayList.clone();
    }

    @Override
    public int getFirstIndexOf(int item) {
        for (int i = 0; i < getSize(); i++) {
            if (item == arrayList.get(i)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int getLastIndexOf(int item) {
        for (int i = getSize(); i > 0; i--){
            if (item == arrayList.get(i)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "arrayList=" + arrayList +
                '}';
    }


}



import java.util.*;

class Storage<T> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public T getItem(int index) {
        return items.get(index);
    }
}
class Electronics {
    String name;
    Electronics(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
class Grocery {
    String name;
    Grocery(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
class Clothes {
    String name;
    Clothes(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
public class Generics {
    public static void main(String[] args) {

        Storage<Electronics> eStore = new Storage<>();
        eStore.addItem(new Electronics("Laptop"));

        Storage<Grocery> gStore = new Storage<>();
        gStore.addItem(new Grocery("Rice"));

        Storage<Clothes> cStore = new Storage<>();
        cStore.addItem(new Clothes("Shirt"));

        System.out.println(eStore.getItem(0));
        System.out.println(gStore.getItem(0));
        System.out.println(cStore.getItem(0));
    }
}
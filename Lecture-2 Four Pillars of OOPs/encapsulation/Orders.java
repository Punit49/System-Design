package encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orders {
    private List<String> items = new ArrayList<>();

    public void addItem(String name){
        items.add(name);
    }

    public List<String> getItems(){
        return Collections.unmodifiableList(items);
    }
}

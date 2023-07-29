package generics.oracle;

import java.util.ArrayList;
import java.util.List;

public class NoCast {

    // Demo casting
    public void demoCast(){
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
    }

    // Demo no casting with generics
    public void demoNoCast(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        String s = list.get(0);
    }
}

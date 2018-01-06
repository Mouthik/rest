package hello;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class IceCreamData {

    public HashMap<Integer, String> getIcecreams() {
        HashMap<Integer, String> ice = new HashMap<Integer, String>();
        ice.put(1, "Venilla");
        ice.put(2, "Choclate");
        ice.put(3, "StrawBerry");
        ice.put(4, "BlackCurrent");
        ice.put(5, "Pista");
        return ice;
    }
}

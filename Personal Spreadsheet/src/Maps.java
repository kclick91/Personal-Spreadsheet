import java.util.HashMap;

public class Maps {

    HashMap<String,Integer> hM;
    public Maps()
    {
        hM = new HashMap<>();

    }

    public void AddToMaps(String s, Integer i)
    {
        hM.put(s, i);
    }

    public Integer GetMapInteger(String s)
    {
        Integer i = hM.get(s);
        return i;
    }

}

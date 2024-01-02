package lesson1;

import java.util.ArrayList;

public class DongVatService {
    private ArrayList<DongVat> dsThuCung = new ArrayList<>();
    
    public void add(DongVat dv)
    {
        this.dsThuCung.add(dv);
    }
    
    public ArrayList<DongVat> getDs()
    {
        return dsThuCung;
    }
}

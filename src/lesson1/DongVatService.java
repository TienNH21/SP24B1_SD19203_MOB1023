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
    
    public void setDs(ArrayList<DongVat> ds)
    {
        this.dsThuCung = ds;
    }
    
    public void delete(int viTri)
    {
        this.dsThuCung.remove(viTri);
    }
    
    public void update(int viTri, DongVat dvNew)
    {
        this.dsThuCung.set(viTri, dvNew);
    }
}

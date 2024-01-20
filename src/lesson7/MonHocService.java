package lesson7;

import java.util.ArrayList;

public class MonHocService {
    private ArrayList<MonHoc> listMH;
    
    public MonHocService()
    {
        this.listMH = new ArrayList<>();
        this.listMH.add(new MonHoc("SOF201", "Lap trinh Java 1", 3, 1, "UDPM"));
        this.listMH.add(new MonHoc("SOF202", "Lap trinh Java 2", 3, 1, "UDPM"));
        this.listMH.add(new MonHoc("SOF203", "Lap trinh Java 3", 4, 1, "UDPM"));
    }
    
    public ArrayList<MonHoc> getList()
    {
        return this.listMH;
    }
    
    public MonHoc get(int viTri)
    {
        return this.listMH.get(viTri);
    }
    
    public void update(int viTri, MonHoc mh)
    {
        this.listMH.set(viTri, mh);
    }
}

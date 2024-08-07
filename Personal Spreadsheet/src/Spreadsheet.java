import java.util.ArrayList;
import java.util.List;

public class Spreadsheet {

    private int letterSize;
    private int numberSize;
    private List<Table> tableList;
    public Spreadsheet()
    {
        tableList = new ArrayList<Table>();
    }
    public Spreadsheet(int lS, int nS)
    {
        tableList = new ArrayList<Table>();
        letterSize = lS;
        numberSize = nS;
    }

    public void AddTable(Table t)
    {
        tableList.add(t);
        System.out.println("Wonderful! The table has been added the spreadsheet!");
    }


}

import java.util.ArrayList;
import java.util.List;

public class Spreadsheet {

    private int letterSize;
    private int numberSize;
    private List<Table> tableList;
    private String nameOfSpreadsheet;
    private Object[][] cells;
    public Spreadsheet()
    {
        tableList = new ArrayList<Table>();
    }
    public Spreadsheet(int lS, int nS, String nSS)
    {
        tableList = new ArrayList<Table>();
        letterSize = lS;
        numberSize = nS;
        nameOfSpreadsheet = nSS;
    }
    public Spreadsheet(int lS, int nS, String nSS, Object[][] c)
    {
        tableList = new ArrayList<Table>();
        letterSize = lS;
        numberSize = nS;
        nameOfSpreadsheet = nSS;
        cells = c;
    }

    public void AddTable(Table t)
    {
        tableList.add(t);
        System.out.println("Wonderful! The table has been added to the spreadsheet!");
    }

    public String GetName()
    {
        return nameOfSpreadsheet;
    }



}

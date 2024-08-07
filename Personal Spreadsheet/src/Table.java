import java.util.Map;

public class Table {

    //Make sure there are no overlaps from tables in the same spreadsheet

    private String letLoc;
    private int numLoc;
    private int columnCount;
    private int rowCount;
    private double[][] values;

    String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G","H", "I", "J", "K","L", "M", "N","O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private Maps map;

    RowColumnNames rowNames;
    RowColumnNames columnNames;
    public Table()
    {

    }

    public Table(String letL, int numL, int cC, int rC)
    {
        letLoc = letL;
        numLoc = numL;
        columnCount = cC;
        rowCount = rC;

    }

    public Table(String letL, int numL,int cC, int rC, double[][] v)
    {
        letLoc = letL;
        numLoc = numL;
        columnCount = cC;
        rowCount = rC;
        values = v;
    }

    public void SetValue(String let, int num, double v)
    {
        Integer letNum = map.GetMapInteger(let);



    }

    public double[][] GetValues()
    {
        return values;
    }


}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to my Personal Spreadsheets");

        Spreadsheet spsh = new Spreadsheet(100, 100);

        double[][] testValues = new double[][]{{68,75,88},{99,77,71},{89,88,81}};

        Table t = new Table("B", 2, 3, 3,testValues);

        spsh.AddTable(t);

        //Cells A2 through A4
        RowColumnNames rcnOne = new RowColumnNames(new String[]{"Student 1", "Student 2", "Student 3"}, 3);
        //Cells B1 through D1
        RowColumnNames rcnTwo = new RowColumnNames(new String[]{"Grade 1", "Grade 2", "Grade 3"}, 3);

        //Set A1 through D4, Show A1 through D4

        //Temporary display for example, needs to be saved to cells
        System.out.println("---- " + rcnTwo.names[0] + " " + rcnTwo.names[1] + " " + rcnTwo.names[2]);
        System.out.println(rcnOne.names[0] + " "  + t.GetValues()[0][0] + " " + t.GetValues()[0][1] + " " + t.GetValues()[0][2]);
        System.out.println(rcnOne.names[1] + " "  + t.GetValues()[1][0] + " " + t.GetValues()[1][1] + " " + t.GetValues()[1][2]);
        System.out.println(rcnOne.names[2] + " "  + t.GetValues()[2][0] + " " + t.GetValues()[2][1] + " " + t.GetValues()[2][2]);

















    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to my Personal Spreadsheets");

        Spreadsheet spsh = new Spreadsheet(100, 100, "Spreadsheet of Classes");
        Spreadsheet spshTwo = new Spreadsheet(50,50, "Answer Keys");

        double[][] testValues = new double[][]{{68,75,88},{99,77,71},{89,88,81}};

        double[][] testValuesTwo = new double[][]{{87,88,87},{83,89,83},{97,90,89}};

        double[][] testAnswers = new double[][]{{4.1, 5.1, 4.3, 4.7, 10.2},{4.1, 5.9, 2.3, 4.7, 11.2}, {1.5, 60.1, 4.3, 4.7, 10.2}, {4.1, 15.1, 40.3, 14.7, 10.2}, {4.1, 5.1, 4.3, 6.7, 12.2}};
        Table t = new Table("B", 2, 3, 3,testValues);
        Table tTwo = new Table("B", 6, 4,4, testValuesTwo);

        Table tThree = new Table("B", 2, 5, 4, testAnswers);


        spsh.AddTable(t);
        spshTwo.AddTable(tThree);

        //Table 1
        //Cells A2 through A4
        RowColumnNames rcnOne = new RowColumnNames(new String[]{"Student 1", "Student 2", "Student 3"}, 3);
        //Cells B1 through D1
        RowColumnNames rcnTwo = new RowColumnNames(new String[]{"Grade 1", "Grade 2", "Grade 3"}, 3);



        //Set A1 through D4, Show A1 through D4

        //Temporary display for example, needs to be saved to cells
        System.out.println(spsh.GetName());
        System.out.println("---- " + rcnTwo.names[0] + " " + rcnTwo.names[1] + " " + rcnTwo.names[2]);
        System.out.println(rcnOne.names[0] + " "  + t.GetValues()[0][0] + " " + t.GetValues()[0][1] + " " + t.GetValues()[0][2]);
        System.out.println(rcnOne.names[1] + " "  + t.GetValues()[1][0] + " " + t.GetValues()[1][1] + " " + t.GetValues()[1][2]);
        System.out.println(rcnOne.names[2] + " "  + t.GetValues()[2][0] + " " + t.GetValues()[2][1] + " " + t.GetValues()[2][2]);

        //System.out.println(spsh.GetName());
        System.out.println("---- " + rcnTwo.names[0] + " " + rcnTwo.names[1] + " " + rcnTwo.names[2]);
        System.out.println(rcnOne.names[0] + " "  + tTwo.GetValues()[0][0] + " " + tTwo.GetValues()[0][1] + " " + tTwo.GetValues()[0][2]);
        System.out.println(rcnOne.names[1] + " "  + tTwo.GetValues()[1][0] + " " + tTwo.GetValues()[1][1] + " " + tTwo.GetValues()[1][2]);
        System.out.println(rcnOne.names[2] + " "  + tTwo.GetValues()[2][0] + " " + tTwo.GetValues()[2][1] + " " + tTwo.GetValues()[2][2]);

        //Table Two
        //Cells A2 through A6
        RowColumnNames tests = new RowColumnNames(new String[]{"Test 1", "Test 2", "Test 3", "Test 4", "Test 5"}, 5);

        //Cells B2 through B11
        RowColumnNames answers = new RowColumnNames(new String[]{"Answer 1", "Answer 2", "Answer 3", "Answer 4"}, 4);

        //Temporary display for example, needs to be saved to cells
        System.out.println(spshTwo.GetName());
        System.out.println("---- " + tests.names[0] + " " + tests.names[1] + " " + tests.names[2] + " " + tests.names[3] + " " + tests.names[4]);
        System.out.println(answers.names[0] + " "  + tThree.GetValues()[0][0] + " " + tThree.GetValues()[0][1] + " " + tThree.GetValues()[0][2] + " " + tThree.GetValues()[0][3] + " " + tThree.GetValues()[0][4]);
        System.out.println(answers.names[1] + " "  + tThree.GetValues()[1][0] + " " + tThree.GetValues()[1][1] + " " + tThree.GetValues()[1][2] + " " + tThree.GetValues()[1][3] + " " + tThree.GetValues()[1][4]);
        System.out.println(answers.names[2] + " "  + tThree.GetValues()[2][0] + " " + tThree.GetValues()[2][1] + " " + tThree.GetValues()[2][2] + " " + tThree.GetValues()[2][3] + " " + tThree.GetValues()[0][4]);
        System.out.println(answers.names[3] + " "  + tThree.GetValues()[3][0] + " " + tThree.GetValues()[3][1] + " " + tThree.GetValues()[3][2] + " " + tThree.GetValues()[3][3] + " " + tThree.GetValues()[0][4]);











    }
}
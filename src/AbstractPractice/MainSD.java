package AbstractPractice;

public class MainSD {

    public static void main(String[] args) {

        SoftwareDevelopment sdAnd = new AndroidDeveloper();

        sdAnd.makingApp();

        System.out.println();

        SoftwareDevelopment sdIOS = new IOSDeveloper();

        sdIOS.makingApp();

    }

}

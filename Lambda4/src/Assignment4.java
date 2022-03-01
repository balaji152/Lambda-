import java.util.*;


public class Assignment4 {
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        employeeList.removeIf(s -> ((s.length())%2 != 0));
        return employeeList;
    }
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<> (Arrays.asList("Balaji","Kaveesh", "Shane", "Mithun", "Ruby"));
        System.out.println(removeOddLength(employeeList));
    }
}
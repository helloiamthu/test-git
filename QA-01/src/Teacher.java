import java.util.*;
import static java.util.Arrays.asList;
public class Teacher {
    public static void main(String[] args) {
        HashMap <String, List<Object>> student = new HashMap<>();
        //cau 1
        student.put("MS1", asList("SV1", "22"));
        student.put("MS2", asList("SV2", "21"));
        student.put("MS3", asList("SV3", "20"));
        student.put("MS4", asList("SV4", 23, 8.7f));
        System.out.println(student);
        //cau 2
        student.replace("MS2",asList("SV2","22"));
        System.out.println(student.get("MS2"));
        //cau 3
        for (String i : student.keySet()){
            System.out.println(i);
        }
    }
}
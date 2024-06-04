import java.util.Map;
import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140172", "Thala");
        mahasiswaMap.put("24060122140174", "Nela");
        mahasiswaMap.put("24060122140162", "Zino");
        mahasiswaMap.put("24060122130082", "Asan");

        // Lambda expression used to print key and value
        mahasiswaMap.forEach((nim, nama) -> System.out.println( nim + " : " + nama));
    }
}
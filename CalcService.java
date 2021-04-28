import java.util.HashMap;
import java.util.Map;

public class CalcService {
  private static final Map<int[], int[]> serviceCache = new HashMap<>();

  public static int[] calculate(int[] src) {
    int[] result = serviceCache.get(src);
    if (result == null) {
      result = executeCalculation(src);
      serviceCache.put(src, result);
    }
    return result;
  }

  private static int[] executeCalculation(int[] src) { return ...}
}

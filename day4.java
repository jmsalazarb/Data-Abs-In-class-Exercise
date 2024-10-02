public class day4 {
    HashMap<Integer, Integer> pairMap = new HashMap<>();
    for (int[] pair : pairs) {
        int a = pair[0];
        int b = pair[1];

    }
    if (pairMap.containsKey(b) && pairMap.get(b) == a) {
        System.out.println(a + ", " + b);
    } else {
        pairMap.put(a, b);
    }

    public static void main(String args []){
        System.out.println(day4());
    }
}



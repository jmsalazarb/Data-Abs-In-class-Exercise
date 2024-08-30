public class Main {
    public static void main(String[] args) {
        int target = 20;
        int count = 0;
        
        for(int i = 0; i < target; i++){
            if (i % 5 == 0 || i%7 == 0) {
                count += i;
            }
        }
        System.out.println(count);


        int[] intArray = new int[]{1,2,2,4};
        int i;
        int j;
        boolean flag = false;
        for(i = 0; i < intArray.length; i++){
            for(j = i+1; j < intArray.length; j++){
                if (intArray[i] == intArray[j]){
                    flag = true;
                    break;
                } 
            }
        }
        System.out.println(flag);
    }
}


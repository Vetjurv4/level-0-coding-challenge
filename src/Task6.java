public class Task6 {

    public int maximum(int... numbers){
        int max = numbers[0];
        for(int x : numbers){
            if(x > max)
                max = x;
        }
        return max;
    }
}

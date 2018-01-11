import java.util.ArrayList;
import java.util.Arrays;
public class randomZeros {
    public static void main(String[] args) {
        ArrayList<Integer> numsRandom = new ArrayList<Integer>();
        numsRandom.addAll(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
        for(int i = 0;i < numsRandom.size();i++){
            numsRandom.set(i,(int)(Math.random()*100));
        }
        System.out.println(numsRandom);
        for(int i = 0;i < numsRandom.size();i++){
            numsRandom.set(i,0);
        }
        System.out.println(numsRandom);
    }
}
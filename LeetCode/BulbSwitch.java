package LeetCode;

public class BulbSwitch {
    public static int bulbSwitch(int n) {
        boolean onBulbs[] = new boolean[n];

        for(int i=0 ; i<onBulbs.length ; i++) {
            onBulbs[i] = false;
        }
        if(n>=1) {
            for(int i=0 ; i<onBulbs.length ; i++)
                if(onBulbs[i])
                    onBulbs[i] = false;
                else onBulbs[i] = true;
        }
        int i = 1;
        while(i<=n) {
            onBulbs = bulbSwitcher(onBulbs,i++);

        }
        int count = 0;
        for(int j=0 ; j<onBulbs.length ; j++) {
            if(onBulbs[j])
                count++;
        }
        return count;
    }

    public static int bulb(int n) {
        return (int)Math.sqrt(n);
    }
    public static boolean[] bulbSwitcher(boolean onBulbs[], int i) {
        for(int k=i ; k<onBulbs.length ; k = k+i+1) {
            if(onBulbs[k])
                onBulbs[k] = false;
            else onBulbs[k] = true;
        }

        return onBulbs;
    }

    public static void main(String args[]) {
        System.out.println(bulb(99999999));
    }
}

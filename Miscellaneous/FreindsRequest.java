package Miscellaneous;

import java.util.Arrays;

public class FreindsRequest {
    public static int numFriendRequests(int[] ages,int i) {
        Arrays.sort(ages);
        int count = 0;

        for(int b=ages.length-1;b>=0;b--) {
            for(int a=b-1;a>=0;a--) {
                System.out.println(ages[a] +"  " + ages[b]);
                System.out.println(ages[a]<=0.5*ages[b]+7);
                System.out.println(0.5*ages[b]+7 +" "+ages[a]);
                if((ages[a]<=0.5*ages[b]+7) ) {
                  //  break;
                }
                else {
                    count++;
                }
                if(ages[a] == ages[b]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int numFriendRequests(int[] ages) {
        int cntFriendRequests = 0;
        int[] map = new int[121]; // 1 ~ 120;
        for (int age : ages) {
            map[age]++;
        }
        for (int A = 1; A <= 120; A++) {
            for (int B = 1; B <= 120; B++) {
                if (B <= 0.5 * A + 7) continue;
                if (B > A) continue;
                if (B > 100 && A < 100) continue;
                cntFriendRequests += map[A] * map[B];
                if (A == B) {
                    cntFriendRequests -= map[A];
                }
            }
        }
        return cntFriendRequests;
    }
    public static void main(String args[]) {
        int ages[] = {16,17,18};
        System.out.println(numFriendRequests(ages));
    }
}

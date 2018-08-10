package Miscellaneous;

import java.util.*;

public class AccountMerge {
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,TreeSet<String>> merge = new HashMap<String,TreeSet<String>>();

        for(List l:accounts) {
            TreeSet<String> set = new TreeSet<>();
            TreeSet<String> containedSet = new TreeSet<>();
            String s=null;
            for(int i=0;i<l.size();i++) {
                if(merge.containsKey(l.get(i))) {
                    s=(String)l.get(i);
                    set = merge.get(l.get(i));
                }
               else if(!set.isEmpty())
                    set.add((String)l.get(i));
               else if(i==0)
                    s=(String)l.get(0);
                    else
                        set.add((String)l.get(i));
            }

            merge.put(s,set);
        }
        List<List<String>> list = new ArrayList<List<String>>();
//        for(Map.Entry m : merge) {
//            TreeSet<String> s = (TreeSet<String>) m.getValue();
//            List<String> l = new ArrayList<String>();
//            l.add((String)m.getKey());
//            for(String s1:s){
//                l.add(s1);
//            }
//            list.add(l);
//        }
        return null;
    }

    public static void main(String args[]) {
        List<List<String>> accounts = new ArrayList<>();
        List<String> merge1 = new ArrayList<>();
        List<String> merge2 = new ArrayList<>();
        List<String> merge3 = new ArrayList<>();
        List<String> merge4 = new ArrayList<>();
        merge1.add("John");
        merge1.add("johnsmith@mail.com");
        merge1.add("john_newyork@mail.com");
        merge2.add("John");
        merge2.add("johnsmith@mail.com");
        merge2.add("john00@mail.com");
        merge3.add("Mary");
        merge3.add("mary@mail.com");
        merge4.add("John");
        merge4.add("johnnybravo@mail.com");
        accounts.add(merge1);
        accounts.add(merge2);
        accounts.add(merge3);
        accounts.add(merge4);
        accountsMerge(accounts);
    }
}

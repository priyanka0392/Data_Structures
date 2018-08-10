package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ShoppingOffer {

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return shoppingOffers(price,special,needs,0);
    }

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs,int pos) {
        int localMin = directShopping(price,needs);
        List<Integer> offer;
        List<Integer> temp = new ArrayList<>();
        for(int i=pos;i<special.size()-1;i++) {
            offer = special.get(i);
            for(int j=0;j<needs.size();j++) {
                if(needs.get(j)<offer.get(i)) {
                    temp = null;
                    break;
                }
                temp.add(needs.get(j)-offer.get(i));
            }
            localMin = Math.min(localMin,offer.get(offer.size()-1)+shoppingOffers(price,special,needs,i));
        }
        return localMin;
    }

    public int directShopping(List<Integer> price, List<Integer> needs) {
        int localMin = 0;
        for(int i=0;i<price.size() ; i++) {
            localMin = localMin + (price.get(i)*needs.get(i));
        }
        return localMin;
    }
}

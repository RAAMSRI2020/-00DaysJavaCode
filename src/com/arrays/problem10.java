package com.arrays;

import java.util.List;

public class problem10 {
    public static void main(String[] args) {
//        List <List<String>>items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
//        String ruleKey = "color", ruleValue = "silver";
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int col=0;
        if(ruleKey.equals("color")){
            col=1;
        }
        if(ruleKey.equals("name")){
            col=2;
        }
        for(int row=0;row<items.size();row++){
            if(items.get(row).get(col).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}

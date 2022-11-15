class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> item : items){
            switch(ruleKey){
                case "type":
                    count += item.get(0).equals(ruleValue)?1:0;
                    break;
                case "color":
                    count += item.get(1).equals(ruleValue)?1:0;
                    break;
                case "name":
                    count += item.get(2).equals(ruleValue)?1:0;
                    break;
            }
            
        }
        return count;
    }
}
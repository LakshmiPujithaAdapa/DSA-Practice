import java.util.*;
class PascalTraingle {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> firstrow = new ArrayList<>();
       firstrow.add(1);
       ans.add(firstrow);
       
       for(int i=1;i<numRows;i++){
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
for(int j=1;j<i;j++){
temp.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
}
        temp.add(1);
ans.add(temp);
       }
return ans;
    }

public static void main(String[] args){
    PascalTraingle solution = new PascalTraingle();
    List<List<Integer>> result=solution.generate(5);
    System.out.println(result);
}
}
import java.util.*;


public class reverseList {
   // Efficient method to reverse both ArrayList and LinkedList
   public static void reverseList(List<Integer> list) {
       if(list instanceof LinkedList){
       ListIterator<Integer> itl=list.listIterator();
       ListIterator<Integer> itr=list.listIterator(list.size());
       int mid=list.size()/2;
       for(int i=0;i<mid;i++){
           int leftvalue=itl.next();
           int rightvalue=itr.previous();


           itl.set(rightvalue);
           itr.set(leftvalue);
       }
       }
       else{
           int left=0,right=list.size()-1;
           while(left < right){
               int temp=list.get(left);
               list.set(left,list.get(right));
               list.set(right,temp);
               left++;
               right--;
           }
       }
   }


   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list1=new ArrayList<>();
       System.out.println("Enter size :");
       int n=sc.nextInt();
       System.out.println("Enter elements :");
       for(int i=0;i<n;i++){
           list1.add(sc.nextInt());
       }
       reverseList(list1);
       System.out.println("Reversed elements :");
       System.out.println(list1);
       LinkedList<Integer> list2=new LinkedList<>();
       System.out.println("Enter size :");
       int n1=sc.nextInt();
       System.out.println("Enter elements :");
       for(int i=0;i<n;i++){
           list2.add(sc.nextInt());
       }
       reverseList(list2);
       System.out.println("Reversed elements :");
       System.out.println(list2);
   }
}


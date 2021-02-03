
public class AddTwoNumbersListNodes {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

             ListNode prev = null;
             ListNode root = null;
                String s="",s1="";
                int sum=0,r;
                int a=0;
                while(l1 != null){
                    s += l1.val;
                    l1 = l1.next;
                }
                while(l2 != null){
                    s1 += l2.val;
                    l2 = l2.next;
                }
                System.out.println(s+" "+s1);
                sum = Integer.parseInt(s) + Integer.parseInt(s1);
                System.out.println(sum);

        ListNode revSum ;

        while (sum != 0 ){
            r=  sum%10;
            sum = sum/10;
            revSum = new ListNode(r);

            if (prev == null) {
                prev = revSum;
                root = revSum;
            } else {
                if (sum == 0){
                    root.val = 0;
                }else {
                    prev.next = revSum;
                    prev = prev.next;
                }
            }
            revSum = revSum.next;
        }
        return root;
        }


    public static void main(String[] args) {
        AddTwoNumbersListNodes ad = new AddTwoNumbersListNodes();
        ListNode ln = new ListNode();
        ListNode ln1 = new ListNode();
        ln.val=0;
        ln1.val=0;
        ad.addTwoNumbers(ln,ln1);
//        ListNode ln2 = new ListNode();
//        ListNode ln3 = new ListNode();
//        ListNode ln4 = new ListNode();
//        ListNode ln5 = new ListNode();
//        ln.val = 2;
//        ln.next =ln1;
//        ln1.val=4;
//        ln1.next=ln2;
//        ln2.val=3;
//
//        ln3.val = 5;
//        ln3.next =ln4;
//        ln4.val=6;
//        ln4.next=ln5;
//        ln5.val=4;
//
//
//        ad.addTwoNumbers(ln,ln3);
    }
    }



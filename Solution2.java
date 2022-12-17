public class Solution2 {
    public List<String> binaryTreePaths(TreeNode root) {
       if (root == null){
           return new ArrayList<>();
       }
       List<String> returnList = new ArrayList<>();
       getBinaryTreePaths(returnList,root,"");
       return returnList;
   
   }
   
   private void getBinaryTreePaths(List<String> returnList, TreeNode node,String base) {
       String current = base.length()==0?node.val+"":base+"->"+node.val;
       if(node.left == null && node.right == null){
           returnList.add(current);
       }
       if (node.left != null){
           getBinaryTreePaths(returnList,node.left,current);
       }
       if (node.right != null){
           getBinaryTreePaths(returnList,node.right,current);
       }
   }
   }
   
   
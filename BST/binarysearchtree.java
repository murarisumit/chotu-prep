import java.util.*;

public class binarysearchtree
{
    node root;

     public binarysearchtree()
     {
         root = null;
     }
 /////insertion/////////


     public void insertion(int d) 
     {
         root = insert(this.root, d);
     }

     private node insert(node root,int d)
     {
         if(root == null)
         {
             root = new node(d);
             return root;
         }

         else if(d < root.key)
         {
             root.left = insert(root.left, d);
         }
         
         else if(d > root.key)
         {
            root.right = insert(root.right, d);
         }
         return root;
     }


//----------------------search----------------//

     public void search(int d)
    {
        node temp ;
        temp = searchnode(root, d);
        if( temp == null)
        {
            System.out.println("node Not found");
        }
        else
        {
            System.out.println(d +" is present in BST");
        }
    }
    public node searchnode(node root , int d)
    {
        if(root == null || root.key == d)
        {
            return root;
        }
        else if(d < root.key)
        {
            return searchnode(root.left, d);
        }
        else 
        {
            return searchnode(root.right, d);
        }
        
    }

    // -----------------deletion--------------//

    public void del(int d) 
    {
     search(d);
     node temp = deletion(root,d);
    }
    
    public node deletion( node root, int d)
    {
      if(root == null)
      {
          return root;
      }
      else if( d < root.key)
      {
          root.left = deletion(root.left, d);
      }
      else if(d > root.key)
      {
          root.right = deletion(root.right, d);
      }
      else 
      {
        if (root.left == null) 
        return root.right; 
        else if (root.right == null) 
        return root.left; 
        root.key = inordersucc(root.right);
        root.right = deletion(root.right, root.key);
      }
      return root;
    }

    //-----------------------bfs------------------//


    public void bfs(node root)
    {
        int level =  height(root);
        for (int i=1; i<= level; i++) 
        printdata(root,i);
    }
    public void  printdata(node root, int level)
    {
        
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.println(root.key + " "); 
        else if (level > 1) 
        { 
            printdata(root.left, level-1); 
            printdata(root.right, level-1); 
        } 
        else 
        return;

    }

    public int height(node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        { 
            int lheight = height(root.left); 
            int rheight = height(root.right); 
    
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    }

    /////-------------------dfs----------------//


    public int inordersucc(node root)
    {
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    }

     public void inorder(node root)
     {
         if(root != null)
         {
             inorder(root.left);
             System.out.println(root.key);
             inorder(root.right);
         }
     }
     public void preorder(node root)
     {
         if(root != null)
         {
             preorder(root.left);
             preorder(root.right);
             System.out.println(root.key);
             
         }
     }
     public void postorder(node root)
     {
         if(root != null)
         {
             System.out.println(root.key);
             postorder(root.left);
             postorder(root.right);
              
         }
     }

     //---------------printing data-----------//
     public void printinorder()
     {
         System.out.println("_________inoder__________");
         inorder(this.root);
         System.out.println("_______preorder__________");
         preorder(this.root);
         System.out.println("_______postorder________");
         postorder(this.root);
         System.out.println("_______BFS___________");
         bfs(this.root);
     }
     
     //----------------main()------------------------//
     public static void main(String[] args) 
     {
         binarysearchtree b = new binarysearchtree();
         b.insertion(10);
         b.insertion(12);
         b.insertion(13);
         b.insertion(7);
         b.insertion(8);
         b.insertion(6);
         b.insertion(11);
         b.printinorder();
         b.search(7);
         b.del(60);
         b.printinorder();

     }

   
}
//---------------node class----------------//
 class node { 
    int key; 
    node left, right; 

    public node(int item) { 
        key = item; 
        left = right = null; 
    } 
} 
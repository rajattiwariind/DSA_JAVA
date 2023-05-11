public class ArrayDeletion {
public static void main(String []args){
    int[] a={1,2,3,4,5,6};//delete element at 0
    for(int i=1;i< a.length; i++){
        a[i-1]=a[i];
    }
    for(int i=0; i< a.length-1;i++){
        System.out.print(a[i]+" ");
    }
}
}

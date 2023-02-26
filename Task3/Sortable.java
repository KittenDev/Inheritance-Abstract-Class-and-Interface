package Task3;

/**
 *
 * @author Dafaa
 */
abstract class Sortable{
    public abstract int compare(Sortable b);
    
    public static void shell_sort(Sortable[] a){
    //Shell sort body
        int n = a.length;
        
        for(int gap = n/2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i += 1){
                Sortable temp = a[i];
                
                int j;
                for (j = i; j >= gap && temp.compare(a[j - gap]) < 1; j -= gap)
                    a[j] = a[j - gap];
                
                a[j] = temp;
            }
        }
    }
}


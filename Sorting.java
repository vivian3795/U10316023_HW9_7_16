/**
 * ID: U10316023 
 * Ex: 7.16
 * Information:
 *		Sorting class is written according to the requirements on P312.
 */
public class Sorting {
  public static void main(String[] args) {
    int m[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
    sort(m);
    printArray(m);
  }

  public static void sort(int m[][]) {
    for (int i = 0; i < m.length; i++) {
      double now = m[i][0];
      int dot = i;

      for (int j = i; j < m.length; j++) {
        if (now > m[j][0] || (now == m[j][0] && m[dot][1] > m[j][1])){ 
			    now = m[j][0];
			    dot = j;
        }
      }

      if (dot != i) {
        int a = m[dot][0];
        int b = m[dot][1];
        m[dot][0] = m[i][0];
        m[dot][1] = m[i][1];
        m[i][0] = a;
        m[i][1] = b;
      }
    }
  }
	
  public static void printArray(int m[][]) {
    for (int i = 0; i < m.length; i++) {
      System.out.println(m[i][0] + ", " + m[i][1]);
    }
  }

}

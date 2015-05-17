/**
 * ID: U10316023 
 * Ex: 7.16
 * Information:
 *		Sorting class is written according to the requirements on P312.
 */
public class Sorting {
  public static void main(String[] args) {
	//the question request 
    int m[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
	//sort m
    sort(m);
	//print it out
    printArray(m);
  }

  public static void sort(int m[][]) {
    for (int i = 0; i < m.length; i++) {
      double now = m[i][0];
      int dot = i;

      for (int j = i; j < m.length; j++) {
		// check whether need to change or not. now > m[j][0] check first number.
		// if the first number equal to now, check the second number.
        if (now > m[j][0] || (now == m[j][0] && m[dot][1] > m[j][1])){ 
			now = m[j][0];
			dot = j;
        }
      }

      // if the conditions are satisfied, change them
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
	//print it out
    for (int i = 0; i < m.length; i++) {
      System.out.println("{" +m[i][0] + ", " + m[i][1] + "}");
    }
  }

}

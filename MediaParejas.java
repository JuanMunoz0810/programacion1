public class MediaParejas {
    public static void main(String[] args) {
        int N1, N2;
        double M, MAX;
       MAX = (N1 + N2)/2;
       while (N2 <> 999) || (N1 <> 999){
        M = (N1 + N2)/2;
        if (M > MAX){
            MAX = M;
        }
       }
      System.out.println("Media maxima= " + MAX);
    }
}
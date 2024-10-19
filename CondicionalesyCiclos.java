public class CondicionalesyCiclos {
    public static void main(String[] args) {
        boolean A, B, C;
        A = B = C = true;
        if (!A && (B && C)) {
            System.out.println("Sentencia if ejecutada");
        } else {
            System.out.println("Sentencia else ejecutada");
        }
        // actividad 2
        int marks = 80;
        if (marks > 70)
            System.out.println("Distincion");
        if (marks > 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        System.out.println("Better luck next time");

        // activida 3 1.1
        int india_score = 300, pakistan_score = 290;
        if (india_score > pakistan_score)
            System.out.println("India wins");
        else
            System.out.println("Pakistan wins ");

        // 1.2
        int india = 300;
        int pakistan = 290;
        System.out.println(india > pakistan ? "India wins" : "Pakistan wins");

        // actividad 4
        int a = 73 + 6 / 25;
        int b = 21 - 8 + a % 3 * 11;
        if (a < b) {
            System.out.println("A is less than B");
        }
        if (a == b) {
            System.out.println("A is equal to B");
        }
        if (a > b) {
            System.out.println("A is greater than B");

            // actividad 5
            if (true && false && true || false)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

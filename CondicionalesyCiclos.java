public class CondicionalesyCiclos {
    public static void main(String[] args) {
        boolean A, B, C;
        A = B = C = true;
        if (!A || (B && C)) {
            System.out.println("Sentencia if ejecutada");
        } else {
            System.out.println("Sentencia else ejecutada");
        }

    }
}

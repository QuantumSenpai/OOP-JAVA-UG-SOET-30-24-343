class DNAAnalyzer {
    public static void main(String[] args) {

        String dna = "ATGCCT";
        int a=0, t=0, g=0, c=0;

        for (int i = 0; i < dna.length(); i++) {
            char ch = dna.charAt(i);

            if (ch == 'A') a++;
            else if (ch == 'T') t++;
            else if (ch == 'G') g++;
            else if (ch == 'C') c++;
        }

        System.out.println("A: " + a);
        System.out.println("T: " + t);
        System.out.println("G: " + g);
        System.out.println("C: " + c);

        StringBuilder sb = new StringBuilder();

        for (int i = dna.length() - 1; i >= 0; i--) {
            char ch = dna.charAt(i);

            if (ch == 'A') sb.append('T');
            else if (ch == 'T') sb.append('A');
            else if (ch == 'G') sb.append('C');
            else if (ch == 'C') sb.append('G');
        }

        System.out.println("Reverse Complement: " + sb.toString());
    }
}

/*
Output:
A: 1
T: 2
G: 1
C: 2
Reverse Complement: AGGCAT
*/

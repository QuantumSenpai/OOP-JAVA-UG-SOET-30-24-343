class LoopDemo {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        String name = "JAVA";

        System.out.println("Using FOR loop (Array):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nUsing WHILE loop (String):");
        int i = 0;
        while (i < name.length()) {
            System.out.println(name.charAt(i));
            i++;
        }

        System.out.println("\nUsing DO-WHILE loop (Array):");
        int j = 0;
        do {
            System.out.println(numbers[j]);
            j++;
        } while (j < numbers.length);
    }
}


/*OUTPUT:
Using FOR loop (Array):
10
20
30
40
50

Using WHILE loop (String):
J
A
V
A

Using DO-WHILE loop (Array):
10
20
30
40
50
*/
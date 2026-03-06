class  Arrayassignmentabulhadi  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Number Of Rows & Columns :-");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] m = new int[row][col];

        for (int k = 1; k <= 2; k++) {

            System.out.println("\nEnter Matrix # " + k + " (Row By Row) :");

            for (int i = 0; i < row; i++) {
                System.out.println("\nEnter values for Row " + (i+1) + " :");
                for (int j = 0; j < col; j++) {
                    m[i][j] = sc.nextInt();
                }
            }

            System.out.println("\nMatrix " + k + " is:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nFor Matrix " + k + " :-");

            for (int i = 0; i < row; i++) {
                int sum = 0;
                for (int j = 0; j < col; j++)
                    sum += m[i][j];
                System.out.println("\nThe Sum Of Row " + (i+1) + " = " + sum);
            }

            for (int j = 0; j < col; j++) {
                int sum = 0;
                for (int i = 0; i < row; i++)
                    sum += m[i][j];
                System.out.println("\nThe Sum Of Column " + (j+1) + " = " + sum);
            }

            if (row == col) {
                int d1 = 0, d2 = 0;
                for (int i = 0; i < row; i++) {
                    d1 += m[i][i];
                    d2 += m[i][row - 1 - i];
                }
                System.out.println("\nThe Sum Of Forward Diagonal = " + d1);
                System.out.println("\nThe Sum Of Reverse Diagonal = " + d2);
            }
        }

        sc.close();
    }

}
    


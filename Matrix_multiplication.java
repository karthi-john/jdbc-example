import java.util.Scanner;

class Matrix_multiplication {
    int a[][] =new int[2][2];
    int b[][] =new int[2][2];
    int result[][] =new int[2][2];
    Scanner s=new Scanner(System.in);
    public void setdata(){
       
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("Enter the a["+(i+1)+"]["+(j+1)+"]:");
                a[i][j] =s.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("Enter the b["+(i+1)+"]["+(j+1)+"]:");
                b[i][j] =s.nextInt();
            }
        }
    }
    public void sum(){
        System.out.println("The sum is :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result[i][j]=a[i][j]+b[i][j];
                System.out.println("sum["+(i+1)+"]["+(j+1)+"]:"+result[i][j]);
             }
        }
    }

    public static void main(String[] args) {
        Matrix_multiplication m=new Matrix_multiplication();

        m.setdata();
        m.sum();
    }
}
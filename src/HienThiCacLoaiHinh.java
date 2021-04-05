import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Print Tam Giac Can");
        System.out.println("5.Exit");
        while (true){
            int choice= sc.nextInt();
            switch (choice){
                case 1:{
                    for(int i=0;i<=2;i++){
                        for(int j=1; j<=7;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                break;
                case 2:{
                    for(int i=5;i>=0;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                break;
                case 3:{
                    for(int i=5;i>=1;i--){
                        for(int j=5;j>=i;j--){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                break;
//                cach 2:
//                for(int i=7;i>=1;i--){
//                    for(int j=1;j<=i;j++){
//                        System.out.print("*");
//                    }
//                    System.out.println("");
//                }
                //Ve tam giac can
                case 4:{
                    for (int i = 0; i < 10; i++){
                        if(i % 2 == 0){
                            continue;
                        }
                        for (int j = 10 ;j > i/2 ; j--){
                            System.out.print("-");
                        }
                        for (int k = 0; k < i;k++){
                            System.out.print("*");
                        }
                        System.out.println("");
                      }

                    }
                    break;
                case 5: {
                    System.exit(0);
                }
                break;
                default:{
                    System.out.println("No Choice");
                }

                }
            }
        }

    }


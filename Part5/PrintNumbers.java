//prints all numbers 0-99
public class PrintNumbers
{
    public static void main(String [] main)
    {
        for(int i=0; i<100; i++){
            System.out.print(i+"\t");
            if(i%10==9){
                System.out.println();
            }
        }

        //another way to write it
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print((i*10+j)+"\t");
            }
            System.out.println();
        }
    }
}
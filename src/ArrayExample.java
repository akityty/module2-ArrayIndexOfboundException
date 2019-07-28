import java.util.Random;
import java.util.Scanner;

public class ArrayExample{
    public Integer[] createRandom(){
        Integer[] array = new Integer[100];
        Random random = new Random();
        System.out.println("danh sach mang: ");

        for (int i = 0; i< array.length; i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        return array;
    }
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chi so phan tu mang");
        int x = scanner.nextInt();
        try{
            System.out.println("pt chi so "+x+" co gtri: "+array[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("vuot qua chi so mang");
        }
    }
}
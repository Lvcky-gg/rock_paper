public class Repetition {
    public static void main(String[] args){
        int count = 10;
        int countTwo = 10;

        while (count > 0){
            System.out.println(count);
            count--;
        }
        do {
            System.out.println(countTwo);
            countTwo--;
        }while(countTwo > 0);

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}

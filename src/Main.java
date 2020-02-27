public class Main {
    public static void main(String[] args) {

        //Suite de Fibonnaci
        FirstAlgo algo = new FirstAlgo();
        System.out.println("algo.fibo(10) = " + algo.fibo(15));

        //Random algo
        FullAlgo fa = new FullAlgo(1,2,3,4);
        System.out.println("fa.calc(1.3) = " + fa.calc(1.3));
    }
}

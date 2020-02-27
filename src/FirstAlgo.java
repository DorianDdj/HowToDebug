public class FirstAlgo {

    public void FirstAlgo() {
    }

    public int fibo(int itr) {
        if (itr == 0) {
            return 0;
        }
        else if (itr == 1) {
            return 1;
        }
        else {
            return fibo(itr-1) + fibo(itr - 2);
        }
    }
}

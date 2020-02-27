public class FullAlgo {
    int m_f1;
    int m_f2;
    int m_f3;
    int m_f4;

    public FullAlgo(int a, int b, int c, int d) {
        m_f1 = a;
        m_f2 = b;
        m_f3 = c;
        m_f4 = d;
    }

    public double calc(double coeff) {
        m_f1++;
        m_f2 = m_f3 + m_f4;
        int temp = m_f1 + m_f2;
        m_f1 += temp;

        double result;

        result = (m_f1 + m_f2 + m_f3 + m_f4);
        result *= coeff;

        return result;
    }
}

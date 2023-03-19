package ru.itmo.task1;

public class TestSin {
    public double count(double arg){
        double x = arg;

        if (x >= 0)
        {
            while (x > Math.PI * 2)
            {
                x -= Math.PI * 2;
            }
        }
        else
        {
            while (x < Math.PI * 2)
            {
                x += Math.PI * 2;
            }
        }

        double summ = 0;
        double fact = 1;
        double sign = 1;
        for (int i = 1; i < 200; i += 2)
        {
            summ += sign * Math.pow(x, i)/fact;
            sign *= -1;
            fact *= (i + 1) * (i + 2);
        }
        return summ;
    }
}

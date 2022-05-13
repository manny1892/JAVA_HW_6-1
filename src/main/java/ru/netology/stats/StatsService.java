package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSales(int[] sales) {
        StatsService service = new StatsService();
        int sum = service.sumSales(sales);
        int avg = sum / sales.length;
        return avg;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxAvgSales(int[] sales) {
        StatsService service = new StatsService();
        int avg = service.avgSales(sales);
        int month = 0;

        for (int sale : sales) {
            if (avg > sale) {
                month = month + 1;
            }
        }
        return month;
    }

    public int minAvgSales(int[] sales) {
        StatsService service = new StatsService();
        int avg = service.avgSales(sales);
        int month = 0;

        for (int sale : sales) {
            if (avg < sale) {
                month = month + 1;
            }
        }
        return month;
    }
}

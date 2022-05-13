package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = 0;
        int avg = 0;
        int max = 0;
        int min = 0;
        int maxAvgMonth = 0;
        int minAvgMonth = 0;

        StatsService service = new StatsService();

        sum = service.sumSales(sales);
        System.out.println("Сумма продаж = " + sum);

        avg = service.avgSales(sales);
        System.out.println("Средние продажи в месяц = " + avg);

        max = service.maxSales(sales);
        System.out.println("Максимальные продажи в " + max + " месяце");

        min = service.minSales(sales);
        System.out.println("Минимальные продажи в " + min + " месяце");

        maxAvgMonth = service.maxAvgSales(sales);
        System.out.println("Продажи выше среднего в " + maxAvgMonth + " месяцах");

        minAvgMonth = service.minAvgSales(sales);
        System.out.println("Продажи ниже среднего в " + minAvgMonth + " месяцах");
    }
}

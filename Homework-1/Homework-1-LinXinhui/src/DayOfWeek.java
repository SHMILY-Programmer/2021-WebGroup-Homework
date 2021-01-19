public class DayOfWeek {
    /**
     * 计算某天是星期几，与题目无关（我才不会说我看错了题目[doge]）
     * @param year 年
     * @param month 月
     * @param day 日
     */
    public static String calculator(int year, int month, int day) {
        if (month == 1) {
            month = 13;
            year -= 1;
        }
        if (month == 2) {
            month = 14;
            year -= 1;
        }
        int week = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400) % 7;
        String weekString = "";
        switch (week) {
            case 0:
                weekString = "Mon";
                break;
            case 1:
                weekString = "Tue";
                break;
            case 3:
                weekString = "Wed";
                break;
            case 4:
                weekString = "Thur";
                break;
            case 5:
                weekString = "Fri";
                break;
            case 6:
                weekString= "Sat";
                break;
        }
        return weekString;
    }

    public static void main(String[] args) {
        System.out.println(calculator(2021, 1, 19));
    }
}

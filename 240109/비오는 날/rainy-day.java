import java.util.*;

class Forecast {
    String date;
    String day;
    String weather;

    Forecast(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    void printInfo() {
        System.out.printf("%s %s %s\n", this.date, this.day, this.weather);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Forecast[] f = new Forecast[n];
        String[] date;
        int rainyDays = 0;
        int idx = 0;

        for (int i = 0; i < n; i += 1) {
            String d1 = sc.next();
            String d2 = sc.next();
            String w = sc.next();

            f[i] = new Forecast(d1, d2, w);

            if (w.equals("Rain")) {
                rainyDays += 1;
            }
        }
        date = new String[rainyDays];
        int cnt = 0;

        for (int i = 0; i < n; i += 1) {
            if (f[i].weather.equals("Rain")) {
                date[cnt] = f[i].date;
                cnt += 1;
            }
        }

        Arrays.sort(date);

        for (int i = 0; i < n; i += 1) {
            if (date[0].equals(f[i].date)) {
                f[i].printInfo();
            }
        }
        
    }
}
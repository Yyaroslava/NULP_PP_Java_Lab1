import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

public class Task10 {
	public static class Date {
		private LocalDate localDate;

		public void setLocalDate( LocalDate localDate) {
			this.localDate = localDate;
		}

		public LocalDate getLocalDate() {
			return localDate;
		}

		@Override
		public int hashCode() {
			return localDate.hashCode();
		}

		@Override
		public String toString() {
			return localDate.toString();
		}

		Date(int year, int month, int day) {
			this.localDate = LocalDate.of(year, month, day);
		}

		Date(LocalDate localDate) {
			this.localDate = localDate;
		}

		public static int duration(Date d1, Date d2) {
			return Period.between(d1.localDate, d2.localDate).getDays();
		}

		public Date add(long a) {
			return new Date(localDate.plusDays(a));
		}
	}

	public static class Weather {
		private String cloudiness;
		private int tempFrom;
		private int tempTo;
		private int pressure;
		private String wind;

		Weather(String cloudiness, int tempFrom, int tempTo, int pressure, String wind) {
			this.cloudiness = cloudiness;
			this.tempFrom = tempFrom;
			this.tempTo = tempTo;
			this.pressure = pressure;
			this.wind = wind;
		}

		public void setCloudiness( String cloudiness) {
			this.cloudiness = cloudiness;
		}

		public void setTempFrom( int tempFrom) {
			this.tempFrom = tempFrom;
		}

		public void setTempTo( int tempTo) {
			this.tempTo = tempTo;
		}

		public void setPressure( int pressure) {
			this.pressure = pressure;
		}

		public void setWind( String wind) {
			this.wind = wind;
		}

		public String getCloudiness() {
			return cloudiness;
		}

		public int getTempFrom() {
			return tempFrom;
		}

		public int getTempTo() {
			return tempTo;
		}

		public int getPressure() {
			return pressure;
		}

		public String getWind() {
			return wind;
		}

		@Override
		public String toString() {
			return String.format("%s, t(C): from %d to %d, P: %d, wind: %s ", this.cloudiness,
					this.tempFrom, this.tempTo, this.pressure, this.wind);
		}
	}

	public static class WeatherCalendar {
		static HashMap<Integer, Weather> data = new HashMap<>();

		public static void write(Date d, Weather w) {
			data.put(d.hashCode(), w);
		}

		public static Weather read(Date d) {
			return data.get(d.hashCode());
		}

		public static Weather[] read(Date d1, Date d2) {
			final long duration = Date.duration(d1, d2);
			Weather[] result = new Weather[(int)duration];
			for (int i = 0; i < duration; i++) {
				Date current = d1.add(i);
				result[i] = read(current);
			}
			return result;
		}
	}

	public static class WeatherCalendarPro extends WeatherCalendar {
		public static void show(Date d1, Date d2) {
			Weather[] wa = WeatherCalendar.read(d1, d2);
			for (Weather w : wa) {
				System.out.println(w);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Task 10: 'Weather week calendar: '");

		Date d1 = new Date(2021, 9, 12);

		Weather w1 = new Weather("Clear", 11, 25, 761, "no");
		Weather w2 = new Weather("Clear", 9, 21, 761, "no");
		Weather w3 = new Weather("Clear", 12, 22, 762, "average");
		Weather w4 = new Weather("Clear", 11, 20, 760, "no");
		Weather w5 = new Weather("Thunder", 7, 19, 745, "strong");
		Weather w6 = new Weather("Partly cloudy", 14, 25, 761, "no");
		Weather w7 = new Weather("Clear", 11, 25, 761, "no");

		WeatherCalendarPro.write(d1, w1);
		WeatherCalendarPro.write(d1.add(1), w2);
		WeatherCalendarPro.write(d1.add(2), w3);
		WeatherCalendarPro.write(d1.add(3), w4);
		WeatherCalendarPro.write(d1.add(4), w5);
		WeatherCalendarPro.write(d1.add(5), w6);
		WeatherCalendarPro.write(d1.add(6), w7);

		WeatherCalendarPro.show(d1, d1.add(6));

	}
}






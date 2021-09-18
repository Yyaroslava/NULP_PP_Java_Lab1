import java.time.LocalDate;

public class Task11 {

	public static class Car {
		public String id;
		public String type;

		Car(String _id, String _type) {
			this.id = _id;
			this.type = _type;
		}

		@Override
		public int hashCode() {
			return id.hashCode();
		}

		@Override
		public boolean equals(final Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (!(obj instanceof Task11.Car)) return false;
			final Task11.Car other = (Task11.Car) obj;
			if (hashCode() != other.hashCode()) return false;
			if (id != other.id) return false;
			return true;
		}

		@Override
		public String toString() {
			return String.format("%s %s", this.id, this.type);
		}

	}

	public static class Person {
		public String id;
		public String name;

		Person(String _id, String _name) {
			this.id = _id;
			this.name = _name;
		}

		@Override
		public int hashCode() {
			return id.hashCode();
		}

		@Override
		public boolean equals(final Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (!(obj instanceof Task11.Car)) return false;
			final Task11.Person other = (Task11.Person) obj;
			if (hashCode() != other.hashCode()) return false;
			if (id != other.id) return false;
			return true;
		}

		@Override
		public String toString() {
			return String.format("%s %s", this.id, this.name);
		}
	}

	public static class Driver extends Person {
		public String working_id;

		Driver(String _id, String _name, String _working_id) {
			super(_id, _name);
			this.working_id = _working_id;
		}

	}

	public static class Customer extends Person {
		public String phone;

		Customer(String _id, String _name, String _phone) {
			super(_id, _name);
			this.phone = _phone;
		}

	}

	public static class Order {
		public String id;
		public String customer_id;
		public String car_type;
		public String address;
		public LocalDate time;

		Order(String _id, String _customer_id, String _car_type, String _address, LocalDate _time) {
			this.id = _id;
			this.customer_id = _customer_id;
			this.car_type = _car_type;
			this.address = _address;
			this.time = _time;
		}

		@Override
		public int hashCode() {
			return id.hashCode();
		}

		@Override
		public boolean equals(final Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (!(obj instanceof Task11.Car)) return false;
			final Task11.Order other = (Task11.Order) obj;
			if (hashCode() != other.hashCode()) return false;
			if (id != other.id) return false;
			return true;
		}

		@Override
		public String toString() {
			return String.format("#%s \n customer id: %s \n car type: %s \n address: %s \n date: %s \n",
					this.id, this.customer_id, this.car_type, this.address, this.time);
		}

	}

	public static void main(String[] args) throws Exception {
		System.out.println("Task 11: 'Taxi'");

		Car car01 = new Car("KAZ2Y5", "Chevrolet Impala");
		Car car02 = new Car("DDD666", "Lamborghini Reventon");

		Driver d01 = new Driver("A124578", "Dean Johnovich Winchester", "K0101");
		Driver d02 = new Driver("B235689", "Petro Petrovych Petrenko", "K0202");
		Driver d03 = new Driver("G134679", "Ivan Smith", "M0303");

		Customer c01 = new Customer("N568545", "Taras Romanovich", "380666666600");
		Customer c02 = new Customer("M555555", "John Bond", "007");

		Order o01 = new Order("S-0001", "N568545", "Chevrolet Impala", "Sakharova 25, Lviv", LocalDate.of(2021,9,18));
		Order o02 = new Order("S-0002", "N568546", "Lamborghini Reventon", "Sakharova 90, Lviv", LocalDate.of(2021,9,19));

		System.out.println("Cars: ");
		System.out.println(car01);
		System.out.println(car02);

		System.out.println();

		System.out.println("Drivers: ");
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);

		System.out.println();

		System.out.println("Customers: ");
		System.out.println(c01);
		System.out.println(c02);

		System.out.println();

		System.out.println("Orders: ");
		System.out.println(o01);
		System.out.println(o02);

	}

}







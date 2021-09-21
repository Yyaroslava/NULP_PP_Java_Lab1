import java.time.LocalDate;

public class Task11 {

	public static class Car {
		private String id;
		private String type;

		Car(String id, String type) {
			this.id = id;
			this.type = type;
		}

		public void setId( String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public void setType( String type) {
			this.type = type;
		}

		public String getType() {
			return type;
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
			if (!id.equals(other.id)) return false;

			return true;
		}

		@Override
		public String toString() {
			return String.format("%s %s", this.id, this.type);
		}

	}

	public static class Person {
		private String id;
		private String name;

		Person(String id, String name) {
			this.id = id;
			this.name = name;
		}

		public void setId( String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public void setName( String name) {
			this.name = name;
		}

		public String getName() {
			return name;
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
			if (!id.equals(other.id)) return false;

			return true;
		}

		@Override
		public String toString() {
			return String.format("%s %s", this.id, this.name);
		}
	}

	public static class Driver extends Person {
		private String workingId;

		public void setWorkingId( String workingId) {
			this.workingId = workingId;
		}

		public String getWorkingId() {
			return workingId;
		}

		Driver(String id, String name, String workingId) {
			super(id, name);
			this.workingId = workingId;
		}

	}

	public static class Customer extends Person {
		private String phone;

		public void setPhone( String phone) {
			this.phone = phone;
		}

		public String getPhone() {
			return phone;
		}

		Customer(String id, String name, String phone) {
			super(id, name);
			this.phone = phone;
		}

	}

	public static class Order {
		private String id;
		private String customerId;
		private String carType;
		private String address;
		private LocalDate time;

		public void setId( String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public void setCustomerId( String customerId) {
			this.customerId = customerId;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCarType( String carType) {
			this.carType = carType;
		}

		public String getCarType() {
			return carType;
		}

		public void setAddress( String address) {
			this.address = address;
		}

		public String getAddress() {
			return address;
		}

		public void setTime( LocalDate time) {
			this.time = time;
		}

		public LocalDate getTime() {
			return time;
		}

		Order(String id, String customerId, String carType, String address, LocalDate time) {
			this.id = id;
			this.customerId = customerId;
			this.carType = carType;
			this.address = address;
			this.time = time;
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
			if (!id.equals(other.id)) return false;
			return true;
		}

		@Override
		public String toString() {
			return String.format("#%s \n customer id: %s \n car type: %s \n address: %s \n date: %s \n",
					this.id, this.customerId, this.carType, this.address, this.time);
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







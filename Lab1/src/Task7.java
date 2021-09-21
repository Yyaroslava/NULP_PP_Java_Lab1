public class Task7 {
	public static class User {
		private String firstName;
		private String lastName;
		private int age;
		private String email;

		public void setFirstName( String firstName) {
			this.firstName = firstName;
		}

		public void setLastName( String lastName) {
			this.lastName = lastName;
		}

		public void setAge( int age) {
			this.age = age;
		}

		public void setEmail( String email) {
			this.email = email;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public int getAge() {
			return age;
		}

		public String getEmail() {
			return email;
		}

		User(final String firstName, final String lastName, final int age, final String email) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.email = email;
		}

		@Override
		public boolean equals(final Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (!(obj instanceof User)) return false;
			final User other = (User) obj;
			if (hashCode() != other.hashCode()) return false;
			if (!firstName.equals(other.firstName)) return false;
			if (!lastName.equals(other.lastName)) return false;
			if (age != other.age) return false;
			if (!email.equals(other.email)) return false;
			return true;
		}

		@Override
		public int hashCode() {
			int result = 17;
			result = 31 * result + firstName.hashCode();
			result = 31 * result + lastName.hashCode();
			result = 31 * result + age;
			result = 31 * result + email.hashCode();
			return result;
		}

		@Override
		public String toString() {
			return String.format("{ firstName: '%s', lastName: '%s', age: %d, email: '%s' }", this.firstName, this.lastName, this.age, this.email );
		}

	}

	public static User u1;
	public static User u2;
	public static User u3;

	public final static void main(String[] args) {
		System.out.println("Task 7: 'User class'");
		u1 = new User("Yaroslava", "Moroz", 18, "yaroslava@gmail.com");
		u2 = new User("Yaroslava", "Moroz", 18, "yaroslava@gmail.com");
		u3 = new User("Yasya", "Moroz", 19, "yasya@gmail.com");
		System.out.println("User 1: " + u1);
		System.out.println("User 2: " + u2);
		System.out.println("User 3: " + u3);

		if (u1.equals(u2)) {
			System.out.println("u1 = u2");
		} else {
			System.out.println("u1 != u2");
		}
		if (u1.equals(u3)) {
			System.out.println("u1 = u3");
		} else {
			System.out.println("u1 != u3");
		}

	}
}





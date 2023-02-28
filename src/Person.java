public class Person {
        private String name;
        private String lastName;
        private int ticket;

        public Person(String name, String lastName, int ticket) {
            this.name = name;
            this.lastName = lastName;
            this.ticket = ticket;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public int getTicket() {
            return ticket;
        }

        public void setTicket(int ticket) {
            this.ticket = ticket;
        }

        @Override
        public String toString() {
            return name + '\'' + lastName ;
        }
}

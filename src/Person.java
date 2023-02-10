


    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void test () {
            System.out.println("TEst");
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", name, age);
        }



        public static void main(String[] args) {
            Person jan = new Person("Jan Fofnjka", 16);
            System.out.println("Name - Age");
            System.out.println(jan);
        }
    }


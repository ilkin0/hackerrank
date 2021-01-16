/**
 * ClassVsInterface
 */
public class ClassVsInterface {
    static class Person {
        int age;

        public Person(int initialAge) {
            if (initialAge < 0) {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                this.age = initialAge;
            }
        }

        public void yearPasses() {
            this.age++;
        }

        public void amIOld() {
            if (this.age < 13) {
                System.out.println("You are young.");
            } else if (this.age >= 13 && this.age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
    }

    public static void main(String[] args) {
        Person person = new Person(14);
        person.yearPasses();
        System.out.println(person.age);
        person.amIOld();
    }
}
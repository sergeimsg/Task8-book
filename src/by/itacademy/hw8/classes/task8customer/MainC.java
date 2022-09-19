package by.itacademy.hw8.classes.task8customer;

public class MainC {
    public static void main(String[] args) {


        Customer customer1 = new Customer(325, "Ivanov", "Ivan", "Ich1",
                123, 6564987);
        Customer customer2 = new Customer(25, "Melnik", "Sergey", "Ich2",
                125, 256);

        Customer customer3 = new Customer(185, "Petrov", "Olga", "Ich3",
                258, 963);
        Customer customer4 = new Customer(789, "Sidorov", "Alex", "Ich4",
                654, 895);

        Customer customer5 = new Customer(566, "Durov", "Dima", "Ich5",
                654, 852);

        //CustomerBase customerBase = new CustomerBase();
       Customer[] custom = {customer1, customer2, customer3, customer4, customer5};

        System.out.println("Before any changes");

        for (int i = 0; i < custom.length; i++) {
            System.out.println("ID " + custom[i].getId()+"; Second name "+custom[i].getSecondName()
                    +"; First name "+custom[i].getFirstName()+"; Surname "+custom[i].getSurname()+
                    "; IdCard " + custom[i].getIdCard()+"; Bank Account"+custom[i].getBankAccaunt());
        }
         sortArray(custom);
        System.out.println("After sorting by name");
        for (int i = 0; i < custom.length; i++) {
            System.out.println("ID " + custom[i].getId()+"; Second name "+custom[i].getSecondName()
                    +"; First name "+custom[i].getFirstName()+"; Surname "+custom[i].getSurname()+
                    "; IdCard " + custom[i].getIdCard()+"; Bank Account"+custom[i].getBankAccaunt());
        }
        sortByName(custom);
        System.out.println("After sorting by name vice versa");
        for (int i = 0; i < custom.length; i++) {
            System.out.println("ID " + custom[i].getId()+"; Second name "+custom[i].getSecondName()
                    +"; First name "+custom[i].getFirstName()+"; Surname "+custom[i].getSurname()+
                    "; IdCard " + custom[i].getIdCard()+"; Bank Account"+custom[i].getBankAccaunt());
        }



        System.out.println("Card Id interval 11 - 300");
        idCardInterval(11,300,custom);


    }

    public static Customer[] sortArray(Customer[] customers) {


        for (int i = 0; i < customers.length; i++) {
            Customer temp;
            for (int j = 0; j < customers.length-i-1; j++) {
                if (customers[j].getSecondName().charAt(0) > customers[j + 1].getSecondName().charAt(0)) {
                                       temp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = temp;
                }
            }

        }
        return customers;
    }

    public static Customer[] sortByName (Customer[] customers) {

        int minName;
        Customer temp;

        for (int i = 0; i < customers.length-1; i++) {
            minName=i;
            for (int j = i+1; j < customers.length; j++) {
                if (customers[j].getSecondName().compareTo(customers[minName].getSecondName())<0) {
                    minName=j;

                }
                temp=customers[j];
                customers[j]=customers[minName];
                customers[minName] = temp;
            }

        }

        return customers;
    }

    public static void idCardInterval (int interval1, int interval2, Customer customers[]) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getIdCard()>=interval1 && customers[i].getIdCard()<=interval2) {

                System.out.println("ID " + customers[i].getId()+"; Second name "+customers[i].getSecondName()
                        +"; First name "+customers[i].getFirstName()+"; Surname "+customers[i].getSurname()+
                        "; IdCard " + customers[i].getIdCard()+"; Bank Account"+customers[i].getBankAccaunt());

            }

        }

    }
}






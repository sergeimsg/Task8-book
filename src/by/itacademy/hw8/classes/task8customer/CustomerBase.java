package by.itacademy.hw8.classes.task8customer;

import java.util.Objects;

public class CustomerBase {
    CustomerBase customerBase = new CustomerBase();

    public CustomerBase() {
    }

    public CustomerBase(CustomerBase customerBase) {
        this.customerBase = customerBase;
    }

    public CustomerBase getCustomerBase() {
        return customerBase;
    }

    public void setCustomerBase(CustomerBase customerBase) {
        this.customerBase = customerBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerBase)) return false;
        CustomerBase that = (CustomerBase) o;
        return Objects.equals(getCustomerBase(), that.getCustomerBase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerBase());
    }

    @Override
    public String toString() {
        return "CustomerBase{" +
                "customerBase=" + customerBase +
                '}';
    }
}

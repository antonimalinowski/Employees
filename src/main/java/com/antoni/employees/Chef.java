package com.antoni.employees;

public interface Chef {
    default void cook(String food) {
        System.out.println("I am nowcooking " + food);
    }

    default String cleanup() {
        return "I'm done cleaning up";
    }
}

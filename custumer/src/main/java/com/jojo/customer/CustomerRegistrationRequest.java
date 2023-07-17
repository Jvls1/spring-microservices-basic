package com.jojo.customer;

/**
 * @author João Vitor Lopes
 */
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}

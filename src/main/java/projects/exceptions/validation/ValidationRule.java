package projects.exceptions.validation;

abstract class ValidationRule {
    abstract void validate(Product product) throws ValidationException;
}

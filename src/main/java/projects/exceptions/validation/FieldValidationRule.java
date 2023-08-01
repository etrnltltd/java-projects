package projects.exceptions.validation;

interface FieldValidationRule {
    void validate (Product product) throws ValidationException;
}

package projects.exceptions.validation;

class ValidationRule7 extends ValidationRule{

    public void validate(Product product) throws ValidationException {
        String ruleName = "RULE-7";
        String description = "Description can not be longer than 2000 characters";
        String fieldName = "description";
        if (product.getDescription().length() > 2000) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}
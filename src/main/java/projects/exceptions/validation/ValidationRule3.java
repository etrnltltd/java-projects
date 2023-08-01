package projects.exceptions.validation;

class ValidationRule3 extends ValidationRule{


    public void validate(Product product) throws ValidationException {
        String title = product.getTitle().trim();
        String ruleName = "RULE-3";
        String description = "Title can not be longer than 100 characters";
        String fieldName = "title";
        if (title.length() > 100) {
            throw new ValidationException(ruleName, description, fieldName);
        }
    }
}

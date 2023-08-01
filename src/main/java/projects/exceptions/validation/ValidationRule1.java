package projects.exceptions.validation;

class ValidationRule1 extends ValidationRule{

    public void validate (Product product) throws ValidationException {
        String title = product.getTitle();
        String ruleName = "RULE-1";
        String description = "Title can not be empty";
        String fieldName = "title";
        if (title == null) {
            throw new ValidationException(ruleName, description, fieldName);
        } else if (title.trim().equals("")){
            throw new ValidationException(ruleName, description, fieldName);
        }

    }
}
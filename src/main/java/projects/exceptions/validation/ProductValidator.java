package projects.exceptions.validation;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}

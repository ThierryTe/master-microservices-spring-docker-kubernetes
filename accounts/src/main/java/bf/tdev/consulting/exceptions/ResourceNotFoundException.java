package bf.tdev.consulting.exceptions;

import bf.tdev.consulting.constants.MessagesConstant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue){
        super(String.format(MessagesConstant.NOT_FOUND_MESSAGE,resourceName,fieldName,fieldValue));
    }
}

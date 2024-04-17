package fr.evanperreau.MesRecettesAPI.exception.handler;

import fr.evanperreau.MesRecettesAPI.dto.error.ApiError;
import fr.evanperreau.MesRecettesAPI.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, 404, ex.getMessage(), ex);
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
}

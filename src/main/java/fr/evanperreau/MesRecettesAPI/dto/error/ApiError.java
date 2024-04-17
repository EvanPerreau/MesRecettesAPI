package fr.evanperreau.MesRecettesAPI.dto.error;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiError {
    private HttpStatus status;
    private int statusCode;
    private LocalDateTime timestamp;
    private String message;
    private String debugMessage;

    public ApiError(HttpStatus status, int statusCode, String message, Throwable ex) {
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.debugMessage = ex.getLocalizedMessage();
    }
}

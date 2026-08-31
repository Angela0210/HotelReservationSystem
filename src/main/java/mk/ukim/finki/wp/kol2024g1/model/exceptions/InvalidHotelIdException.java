package mk.ukim.finki.wp.kol2024g1.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidHotelIdException extends RuntimeException {

    public InvalidHotelIdException(Long productId) {
        super(String.format("Product with id %d does not exist.", productId));
    }
}
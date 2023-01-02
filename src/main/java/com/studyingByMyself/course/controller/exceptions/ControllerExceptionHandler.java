package com.studyingByMyself.course.controller.exceptions;

import com.studyingByMyself.course.config.exceptions.ErrorConfig;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.mapping.PropertyReferenceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = {EntityNotFoundException.class, NoSuchFieldException.class,
            EmptyResultDataAccessException.class, NoSuchElementException.class, PropertyReferenceException.class})
    public ResponseEntity<ErrorConfig> notFoundError(Exception exception, HttpServletRequest httpServletRequest) {
        ErrorConfig errorConfig = new ErrorConfig(Instant.now(),
                HttpStatus.NOT_FOUND.value(), "Resource not found.",
                "Resource not found. try again", httpServletRequest.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorConfig);
    }

    @ExceptionHandler(value = {DataIntegrityViolationException.class})
    public ResponseEntity<ErrorConfig> databaseError(Exception exception, HttpServletRequest httpServletRequest) {
        ErrorConfig errorConfig = new ErrorConfig(Instant.now(),
                HttpStatus.BAD_REQUEST.value(), "Resource can't be deleted.",
                "Resource can't be deleted, you still got order(s).", httpServletRequest.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorConfig);
    }
}


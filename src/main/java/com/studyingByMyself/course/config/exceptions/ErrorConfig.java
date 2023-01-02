package com.studyingByMyself.course.config.exceptions;

import java.time.Instant;

public class ErrorConfig {

    private Instant time;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public ErrorConfig() {}

    public ErrorConfig(Instant time, Integer status, String error, String message, String path) {
        this.time = time;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

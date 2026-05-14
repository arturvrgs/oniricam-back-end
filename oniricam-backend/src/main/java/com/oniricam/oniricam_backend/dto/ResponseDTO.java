package com.oniricam.oniricam_backend.dto;

import java.time.LocalDateTime;

public class ResponseDTO<T> {
    private int status;
    private String message;
    private boolean ok;
    private T data;
    private LocalDateTime timestamp;

    public ResponseDTO(int status, boolean ok, String message, T data) {
        this.status = status;
        this.ok = ok;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

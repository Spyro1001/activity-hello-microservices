package com.example.aggregator.model;

public class AggregatorMessage {

    private String message;

    public AggregatorMessage() {
    }

    public AggregatorMessage(String message) {
        this.message = message;
    }

    // copy constructor
    public AggregatorMessage(Message message) {
        this.message = message.getMessage();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AggregatorMessage{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

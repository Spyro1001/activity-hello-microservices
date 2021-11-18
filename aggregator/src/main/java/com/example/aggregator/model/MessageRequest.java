package com.example.aggregator.model;

import javax.validation.constraints.Pattern;

public class MessageRequest {

    @Pattern(regexp = "^hello$|^world$")
    private String targetMessage;

    public MessageRequest() {
    }

    public MessageRequest(@Pattern(regexp = "^hello$|^world$") String targetMessage) {
        this.targetMessage = targetMessage;
    }

    public String getTargetMessage() {
        return targetMessage;
    }

    public void setTargetMessage(String targetMessage) {
        this.targetMessage = targetMessage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageRequest{");
        sb.append("targetMessage='").append(targetMessage).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

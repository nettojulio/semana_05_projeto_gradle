package br.com.julioneto.semana_05_projeto_gradle.utils;

public class MessageBuilder {
    private int statusCode;
    private String message;

    public MessageBuilder(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static MessageBuilder messageBuilder(int code, String message){
        return new MessageBuilder(code, message);
    }
}

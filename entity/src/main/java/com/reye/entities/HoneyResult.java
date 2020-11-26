package com.reye.entities;

public class HoneyResult {

    private final static Integer CODE_NORMAL = 1;
    private final static Integer CODE_ERROR = -1;

    private int code = CODE_NORMAL;
    private String message;
    private String error;
    private Object data;
    public HoneyResult () {
        super();
    }
    private HoneyResult (int code, String message, String error, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.error = error;
        this.data = data;
    }
    public static HoneyResult error(String error) {
        return new HoneyResult(CODE_ERROR,null,error,null);
    }
    public static HoneyResult normal(String message) {
        return new HoneyResult(CODE_NORMAL,message,null,null);
    }
    public static HoneyResult data(Object data) {
        return new HoneyResult(CODE_NORMAL,null,null,data);
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}

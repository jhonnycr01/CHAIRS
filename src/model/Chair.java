package model;

public class Chair {
    private String line;
    private int chairNumber;
    private String status;

    public Chair(String line, int chairNumber) {
        this.line = line;
        this.chairNumber = chairNumber;
        this.status = "ACTIVE";
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    public void setChaiiNumber(int chairNumber) {
        this.chairNumber = chairNumber;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
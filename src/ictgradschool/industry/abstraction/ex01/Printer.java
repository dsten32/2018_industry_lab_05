package ictgradschool.industry.abstraction.ex01;

public interface Printer {
    public void printDocument(Document d);
    public int getEstimateMinutesRemaining();
    public Error getError();
}

package ictgradschool.industry.abstraction.ex01;

public class PrintOmatic implements Printer{


    @Override
    public void printDocument(Document d) {

    }

    @Override
    public int getEstimateMinutesRemaining() {
        return 0;
    }

    @Override
    public Error getError() {
        return null;
    }
}

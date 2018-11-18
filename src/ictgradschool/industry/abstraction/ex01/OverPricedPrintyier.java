package ictgradschool.industry.abstraction.ex01;

public class OverPricedPrintyier implements Scanner,Printer{


    @Override
    public void printDocument(Document d) {

    }

    @Override
    public int getEstimateMinutesRemaining() {
        return 0;
    }

    @Override
    public Document getDocument() {
        return null;
    }

    @Override
    public boolean jobsDone() {
        return false;
    }

    @Override
    public Error getError() {
        return null;
    }
}

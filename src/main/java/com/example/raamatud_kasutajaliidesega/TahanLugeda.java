package com.example.raamatud_kasutajaliidesega;

public class TahanLugeda extends Nimekiri {
    public TahanLugeda() {
        super();
    }

    protected void lisaRaamat(String pealkiri, String autor, int lehekülgi) {
        super.lisaRaamat(pealkiri, autor, lehekülgi, 0);
    }
}

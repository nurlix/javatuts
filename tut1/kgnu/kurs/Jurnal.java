package kgnu.kurs;

import java.util.ArrayList;
import java.util.List;

public class Jurnal
{
    public String Grupa;
    List<Tabel> tabel = new ArrayList<Tabel>();

    public Jurnal() { }

    public Jurnal(String grupa, List<Tabel> tabel) {
        Grupa = grupa;
        this.tabel = tabel;
    }
}
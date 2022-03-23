package bangun;

public class Balok extends PersegiPanjang implements MenghitungRuang {

    private final double t;

    public Balok(double p, double l, double t) {
        super(p, l);
        this.t = t;
    }

    @Override
    public double hitungVolume() {
        return this.hitungLuas() * this.t;
    }

    @Override
    public double hitungLuaspermukaan() {
        return 2 * this.p * this.l + 2 * this.l * this.t + 2 * this.p * this.t;
    }

}

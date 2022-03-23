package bangun;

public class PersegiPanjang implements MenghitungBidang {

    final double p;
    final double l;

    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    @Override
    public double hitungLuas() {
        return this.p * this.l;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (this.p + this.l);
    }

    public double hitungLuas(double x, double y) {
        return x * y;
    }

    public double hitungKeliling(double x, double y) {
        return 2 * (x + y);
    }

}

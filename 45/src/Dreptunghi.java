import java.util.ArrayList;
import java.util.Iterator;

public class Dreptunghi {
	private Punct q, w, e, r;
	private static int i = 0;
	private ArrayList<Punct> y = new ArrayList<Punct>();

	public Dreptunghi(int x, int x1, int x2, int x3, int x4, int x5, int x6, int x7) {
		q = new Punct(x, x1);
		w = new Punct(x2, x3);
		e = new Punct(x4, x5);
		r = new Punct(x6, x7);

	}

	public void addthings() {
		y.add(q);
		y.add(w);
		y.add(e);
		y.add(r);

	}

	public Punct getq() {
		return q;
	}

	public Punct getw() {
		return w;

	}

	public Punct gete() {
		return e;

	}

	public Punct getr() {
		return r;

	}

	public boolean equals(Object b) {
		return true;
	}

	@Override
	public int hashCode() {
		int has = q.getx()+q.gety()+w.getx()+w.gety()+e.getx()+e.gety()+r.getx()+r.gety();
		
		return has;

	}

	@Override
	public String toString() {
		i++;

		return "Dreptunghi " + i + "" + q + "" + w + "" + e + "" + r;
	}
}

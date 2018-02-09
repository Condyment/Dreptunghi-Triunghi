import java.util.Vector;

public class Triunghi {
	private Punct q, w, e;
	private Vector<Punct> y = new Vector<Punct>();
private static int i=0;
	public Triunghi(int x, int x1, int x2, int x3, int x4, int x5) {
		q = new Punct(x, x1);
		w = new Punct(x2, x3);
		e = new Punct(x4, x5);
	}
	public void addthings() {
		y.add(q);
		y.add(w);
		y.add(e);
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

	public boolean equals(Object b) {
		return true;
	}

	@Override
	public int hashCode() {
		int has = q.getx()+q.gety()+w.getx()+w.gety()+e.getx()+e.gety();
		
		return has;

	}

	@Override
	public String toString() {
		i++;

		return "Triunghi " + i + "" + q + "" + w + "" + e;
	}

}

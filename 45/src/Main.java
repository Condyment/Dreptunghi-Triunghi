import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	static public void main(String[] args) {

		try {
			Scanner x = new Scanner(new File("in.txt"));
			HashSet<Dreptunghi> wat = new HashSet<Dreptunghi>();
			HashSet<Triunghi> water = new HashSet<Triunghi>();
			String ppp[] = new String[5];
			int i = 0;
			while (x.hasNext()) {

				String k = x.nextLine();
				ppp[i] = k;

				i++;

			}
			String dr[] = new String[4];
			String tr[] = new String[4];

			int h = 0;
			int u = 0;
			for (int g = 0; g < 5; g++) {
				if ((ppp[g].split("Dreptunghi:")).length == 2) {

					String rr[] = ppp[g].split("Dreptunghi:");
					dr[h] = rr[1];
					h++;

				}
				if ((ppp[g].split("Triunghi:")).length == 2) {

					String rr[] = ppp[g].split("Triunghi:");
					tr[u] = rr[1];
					u++;
				}
			}
			String drr[] = new String[4];
			String trr[] = new String[4];

			for (int j = 0; j < h; j++) {
				String rr[] = dr[j].split(",");
				drr[j] = rr[0] + " " + rr[1] + " " + rr[2] + " " + rr[3];
				System.out.println(drr[j]);

			}
			for (int j = 0; j < u; j++) {
				String rr[] = tr[j].split(",");
				trr[j] = rr[0] + " " + rr[1] + " " + rr[2];
				System.out.println(trr[j]);
				
			}
			for (int j = 0; j < h; j++) {
				String oo[]=drr[j].split(" ");
				int a=Integer.parseInt(oo[0]);
				int a1=Integer.parseInt(oo[1]);
				int a2=Integer.parseInt(oo[2]);
				int a3=Integer.parseInt(oo[3]);
				int a4=Integer.parseInt(oo[4]);
				int a5=Integer.parseInt(oo[5]);
				int a6=Integer.parseInt(oo[6]);
				int a7=Integer.parseInt(oo[7]);
			wat.add(new Dreptunghi(a,a1,a2,a3,a4,a5,a6,a7));
			
				
				
			}
			print(wat);
			for (int j = 0; j < u; j++) {
				 
			String oo[]=trr[j].split(" ");
			int a=Integer.parseInt(oo[0]);
			int a1=Integer.parseInt(oo[1]);
			int a2=Integer.parseInt(oo[2]);
			int a3=Integer.parseInt(oo[3]);
			int a4=Integer.parseInt(oo[4]);
			int a5=Integer.parseInt(oo[5]);
			water.add(new Triunghi(a,a1,a2,a3,a4,a5));
			}
			print1(water);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void print(HashSet<Dreptunghi> t)
	{
		Iterator<Dreptunghi> a = t.iterator();
		while (a.hasNext()) {
			System.out.println(" "+a.next());
		
			
}
		
	}
	public static void print1(HashSet<Triunghi> t)
	{
		
		Iterator<Triunghi> a = t.iterator();
		while (a.hasNext()) {
			System.out.println(" "+a.next());
	}

}
	}

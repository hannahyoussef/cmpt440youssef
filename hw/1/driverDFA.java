import java.io.*;

public class driverDFA {
	public static void main(String[] args)
	throws IOException {

		ManWolf m = new ManWolf();
		BufferedReader in = 
			new BufferedReader(new InputStreamReader(System.in));

			String s = in.readLine();
			while (s!=null) {
				m.reset();
				m.process(s);
				if (m.accepted()) System.out.println("This was accepted");
				s = in.readLine();
			}
	}
}
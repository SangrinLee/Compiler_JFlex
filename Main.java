import java.io.*;
import java_cup.runtime.Symbol;
public class Main {
	static public void main(String argv[]) {
		for(int i=0; i<argv.length; i++) {
			int j = 1;
			try {
				MyScanner scanner = new MyScanner(new FileReader(argv[i]));
				System.out.println("------ Generating Scanner Success ------");
				System.out.println("------ Scanner Test Start ------");
				Symbol symbol;
				do {
					symbol = scanner.next_token();
					System.out.println("(TOKEN #" + String.valueOf(j) + ") " + symbol);
					j++;
				} while(symbol.sym != sym.EOF);
				System.out.println("------ Scanner Test End ------\n");
			} catch (Exception e) {
				System.out.println("------ Generating Scanner Fail ------");
				System.exit(1);
			}
		}
		
		try {
			parser p = new parser(new MyScanner(new FileReader(argv[0])));
			System.out.println("------ Generating Parser Success ------");
			System.out.println("------ Parsing Test Start ------");
			p.parse();
			System.out.println("------ Parsing Test End ------");
		} catch (Exception e) {
			System.out.println("------ Parsing Fail ------");
			System.exit(1);
		}
	}
}


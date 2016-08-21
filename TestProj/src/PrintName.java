public  class PrintName {
		public static void main(String[] args) {
			String greeting = "Hello my name is ";

			printMyName(greeting, "Doug") ;
			// "Hello my name is Doug"

			printMyName(greeting, "Sam") ;
			// "Hello my name is Sam"
		}

		public static void printMyName(String g, String name) {
			// Does NOT change the original greeting String - which is immutable
			g += name ;
			System.out.println(g);
		}
	}
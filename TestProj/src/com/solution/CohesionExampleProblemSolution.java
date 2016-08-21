package com.solution;

public class CohesionExampleProblemSolution {
}

class InternetDownloader {
	void downloadFromInternet() {

	}

	class DataParser {
		void parseData(String content) {

		}
	}

	class DatabaseStorer {

		void storeIntoDatabase(String data) {

		}
	}

	void doEverything() {
		new InternetDownloader().downloadFromInternet();
		new DataParser().parseData();
		new DatabaseStorer().storeIntoDatabase();

	}
}
/*
 * public class CohesionExampleProblem{
 * 
 * }
 */

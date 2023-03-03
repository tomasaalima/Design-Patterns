package websearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {
	private final File sourceFile;
	private final List<QueryObserver> observers = new ArrayList<>();

	public interface QueryObserver {
		void onQuery(String query);
	}

	// -----------------------------------------------------------------------

	interface SearchFilterStrategy {
		boolean isInterested(String query);
	}

	public static class FilterByWord implements SearchFilterStrategy {
		private String word;

		public FilterByWord(String word) {
			// TODO Auto-generated constructor stub
			this.word = word;
		}

		@Override
		public boolean isInterested(String query) {
			// TODO Auto-generated method stub
			return query.toLowerCase().contains(this.word) ? true : false;
		}
	}

	public static class FilterByLenght implements SearchFilterStrategy {
		private int lenght;

		public FilterByLenght(int lenght) {
			this.lenght = lenght;
		}

		@Override
		public boolean isInterested(String query) {
			// TODO Auto-generated method stub
			return query.length() > this.lenght ? true : false;
		}
	}

	// -----------------------------------------------------------------------

	public WebSearchModel(File sourceFile) {
		this.sourceFile = sourceFile;
	}

	public void pretendToSearch() {
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				notifyAllObservers(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addQueryObserver(QueryObserver queryObserver) {
		observers.add(queryObserver);
	}

	private void notifyAllObservers(String line) {
		for (QueryObserver obs : observers) {
			obs.onQuery(line);
		}
	}
}

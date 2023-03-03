package websearch;

import websearch.WebSearchModel.FilterByLenght;
import websearch.WebSearchModel.FilterByWord;

/**
 * Watches the search queries
 */
public class Snooper {
	private final WebSearchModel model;

	public Snooper(WebSearchModel model) {
		this.model = model;

		model.addQueryObserver(new WebSearchModel.QueryObserver() {
			@Override
			public void onQuery(String query) {
				if (new FilterByWord("friend").isInterested(query)) {
					System.out.println("Oh Yes! " + query);
				}
			}
		});

		model.addQueryObserver(new WebSearchModel.QueryObserver() {
			@Override
			public void onQuery(String query) {
				if (new FilterByLenght(60).isInterested(query)) {
					System.out.println("So long... " + query);
				}
			}
		});

	}
}

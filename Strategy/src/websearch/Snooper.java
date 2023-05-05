package websearch;

import websearch.WebSearchModel.FilterByLenght;
import websearch.WebSearchModel.FilterByWord;
import websearch.WebSearchModel.SearchFilterStrategy;

/**
 * Watches the search queries
 */
public class Snooper {
	private final WebSearchModel model;

	public Snooper(WebSearchModel model) {
		this.model = model;

		model.addQueryObserver(new WebSearchModel.QueryObserver() {
			SearchFilterStrategy filter = new FilterByWord("friend");
			
			@Override
			public void onQuery(String query) {
				if (filter.isInterested(query)) {
					System.out.println("Oh Yes! " + query);
				}
			}

			@Override
			public void setStrategy(SearchFilterStrategy filter) {
				// TODO Auto-generated method stub
				this.filter = filter;
			}
		});

		model.addQueryObserver(new WebSearchModel.QueryObserver() {
			SearchFilterStrategy filter = new FilterByLenght(60);
			
			@Override
			public void onQuery(String query) {
				if (filter.isInterested(query)) {
					System.out.println("So long... " + query);
				}
			}

			@Override
			public void setStrategy(SearchFilterStrategy filter) {
				// TODO Auto-generated method stub
				this.filter = filter;
			}
		});
		model.getObservers().get(1).setStrategy(new FilterByWord("advanced"));;
	}
}

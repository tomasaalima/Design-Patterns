package websearch;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver( new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
            	if(this.isInterested(query))
            		System.out.println("Oh Yes! " + query);
            }
            
            public boolean isInterested(String query) {
				// TODO Auto-generated method stub
				if(query.toLowerCase().contains("friend"))
					return true;
				else
					return false;
        }/*, new WebSearchModel.SearchFilterStrategy() {
			@Override
			public boolean isInterested(String query) {
				// TODO Auto-generated method stub
				if(query.toLowerCase().contains("friend"))
					return true;
				else
					return false;
			}*/
		});
        
        model.addQueryObserver( new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
            	if(this.isInterested(query))
            		System.out.println("So long... " + query);
            }
            
            public boolean isInterested(String query) {
				// TODO Auto-generated method stub
				if(query.length() > 60)
					return true;
				else
					return false;
        }/*, new WebSearchModel.SearchFilterStrategy() {
			@Override
			public boolean isInterested(String query) {
				// TODO Auto-generated method stub
				if(query.toLowerCase().contains("friend"))
					return true;
				else
					return false;
			}*/
		});
   
    }
}

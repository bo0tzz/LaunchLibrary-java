# LaunchLibrary-java
A java wrapper for the launchlibrary.net API

This wrapper makes use of [RxJava](https://github.com/ReactiveX/RxJava) for async requests. 
To get started simply create a new RetrofitInstance and get the API objects from there. For documentation about the API objects, please refer to [LaunchLibrary](https://launchlibrary.net/docs/1.3/api.html). The return values from the API methods are in the form Observable<Page> from RxJava. This represents a page of search results from the API.  

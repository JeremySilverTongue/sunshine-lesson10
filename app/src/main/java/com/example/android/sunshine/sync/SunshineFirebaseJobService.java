// TODO (2) Make sure you've imported the jobdispatcher.JobService, not job.JobService

// TODO (3) Add a class called SunshineFirebaseJobService that extends jobdispatcher.JobService

//  TODO (4) Declare a Thread field called mFetchWeatherThread

//  TODO (5) Override onStartJob and within it, spawn off a separate thread to sync weather data
//              TODO (6) Once the weather data is sync'd, call jobFinished with the appropriate arguments

//  TODO (7) Override onStopJob, interrupt the thread and set it to null and return true

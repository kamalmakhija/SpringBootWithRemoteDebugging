	1. This is a simple spring boot application.
	2. This contain  DockerFile and docker-compose.yaml file
	3.  'docker-compose up -d --build'  =>  It would run the container having this springboot app.
	4. Then Go to Eclipse => Debug Configuration => Remote Java Application => New Configuration
	5. Host => localhost and Port => 5005
	6. Run this configuration.
	7. It should start without any Error. But remember you would see nothing running in local console. But In Debug view , you would see a stack which confirms that it is working in debug mode.
	8. Put breakpoints in controller method.
	9. Hit the Endpoint. You would see it working as debugging.
    10. Logs you would see inside Containers but not on eclipse.
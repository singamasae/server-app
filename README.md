# server-app #
securing REST API with OAuth2
Auth server & resource server are in the same application

### Request Token ###

	curl -X POST -vu clientapp:123456 http://localhost:10000/oauth/token -H "Accept: application/json" -d "grant_type=password&username=rudy&password=123"
	
### Refresh Token ###

	curl -X POST -vu clientapp:123456 http://localhost:10000/oauth/token -H "Accept: application/json" -d "grant_type=refresh_token&refresh_token=REFRESH_TOKEN"
	
## Access protected API ##
	http://localhost:10000/api/user/?access_token=9c62ed6e-6f62-4be4-9e0b-c0d78e3951c8

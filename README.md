# server-app #
securing REST API with OAuth2

### Request Token ###

	curl -X POST -vu clientapp:123456 http://localhost:10000/oauth/token -H "Accept: application/json" -d "grant_type=password&username=rudy&password=123"
	
### Refresh Token ###

	curl -X POST -vu clientapp:123456 http://localhost:10000/oauth/token -H "Accept: application/json" -d "grant_type=refresh_token&refresh_token=YOUR_REFRESH_TOKEN"
	
## Access protected API ##
	http://localhost:10000/api/user/?access_token=YOUR_ACCESS_TOKEN
	
## Unprotected API ##
	http://localhost:10000/api/test

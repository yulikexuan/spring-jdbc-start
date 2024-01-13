# Spring JDBC Start Here

## Testing Commands

### POST Data
- ``` curl -v -w '\nStatus: %{http_code}\nTotal: %{time_total} s\n' POST -H "Content-Type: application/json" -d '{ "product": "Spring Security in Action", "price": 2520 }' http://localhost:8091/purchase ```
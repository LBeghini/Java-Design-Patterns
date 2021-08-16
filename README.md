# ☕ Java Design Patterns

## Proxy

Proxy pattern provides a substitute for another object, so it can controls the access to the original project, allowing actions to be performed either before or after the request gets through the original object.

For example, let's say we have a client that wants to connect to a server. Not every client can perform every action on a server, being required administrator access. In order to control that, we build a proxy and let the client communicate only with the proxy, so the proxy can determine if the client can perform the action or not.
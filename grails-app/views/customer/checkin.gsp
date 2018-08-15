<!doctype html>
<html>

<head>
	<title>Kiosk</title>
    <asset:javascript src="application.js"/>
    <asset:stylesheet src="application.css"/>
	%{--<link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">--}%
	<asset:stylesheet src="bootstrap.css"/>
	%{--<script src="js/respond.js"></script>--}%
</head>

<body>
	<g:form url="[resource:customerInstance, action:'customerLookup']" >
			<g:render template="kioskForm"/>
	</g:form>
	
	
	<g:javascript library="jquery"/>
	%{--<script src="js/bootstrap.min.js"></script>--}%
    <asset:javascript src="bootstrap.js"/>
</body>
</html>
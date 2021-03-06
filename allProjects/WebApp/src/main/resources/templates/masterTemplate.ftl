<#macro masterTemplate title="Cyber Crime Report Unit" active="" brand="Case Managemnent Platform and Tools" subBrand="Report a cyber incident easily and anonymously">
<html>
<head>
    <title>${title}</title>
    <meta charset="utf-8"/>

    <!-- Bootstrap Core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>

    <!-- Custom CSS -->
    <link href="/css/business-casual.css" rel="stylesheet"/>

    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css"/>

    <script src="/js/jquery.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="/js/bootstrap.min.js"></script>
</head>
<body>

    <div class="brand"> ${brand} </div>
    <div class="address-bar">${subBrand}</div>


    <!-- Navigation -->
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
                <a class="navbar-brand" href="${WebPath.getINDEX()}">Cyber Crime Report</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li  <#if active == "index"> class="active" </#if> > <a href="${WebPath.getINDEX()}">Home</a></li>
                    <li  <#if active == "reports"> class="active" </#if> > <a href="${WebPath.getREPORTS()}">Make a Report</a></li>
                    <li  <#if active == "chat"> class="active" </#if> > <a href="${WebPath.getCHAT()}">Live Chatroom</a></li>
                    <li  <#if active == "faq"> class="active" </#if> > <a href="${WebPath.getFAQ()}">FAQ</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <div class="container">
    <#nested/>
    </div>

</div>

<footer>
<div class="container">
    <div class="row">
        <div class="col-lg-12 text-center">
            <p>&copy; 2016 Team 9</p>
        </div>
    </div>
</div>
</footer>

</body>
</html>
</#macro>